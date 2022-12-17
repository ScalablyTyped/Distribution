package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handles localization. Responsible for loading localization assets and returning translations for
  * a certain key. Can also handle plural forms. To override its default behavior define a different
  * implementation for {@link I18n#getText} and {@link I18n#getPluralText}.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.I18n")
@js.native
open class I18n protected ()
  extends typings.playcanvas.mod.I18n {
  /**
    * Create a new I18n instance.
    *
    * @param {AppBase} app - The application.
    */
  def this(app: typings.playcanvas.mod.AppBase) = this()
}
object I18n {
  
  @JSGlobal("pc.I18n")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the first available locale based on the desired locale specified. First tries to
    * find the desired locale and then tries to find an alternative locale based on the language.
    *
    * @param {string} desiredLocale - The desired locale e.g. en-US.
    * @param {object} availableLocales - A dictionary where each key is an available locale.
    * @returns {string} The locale found or if no locale is available returns the default en-US
    * locale.
    * @example
    * // With a defined dictionary of locales
    * var availableLocales = { en: 'en-US', fr: 'fr-FR' };
    * var locale = pc.I18n.getText('en-US', availableLocales);
    * // returns 'en'
    * @ignore
    */
  /* static member */
  inline def findAvailableLocale(desiredLocale: String, availableLocales: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("findAvailableLocale")(desiredLocale.asInstanceOf[js.Any], availableLocales.asInstanceOf[js.Any])).asInstanceOf[String]
}
