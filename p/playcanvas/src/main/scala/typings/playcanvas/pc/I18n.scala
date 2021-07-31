package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handles localization. Responsible for loading localization assets
  * and returning translations for a certain key. Can also handle plural forms. To override
  * its default behavior define a different implementation for {@link pc.I18n#getText} and {@link pc.I18n#getPluralText}.
  * @property locale - The current locale for example "en-US". Changing the locale will raise an event which will cause localized Text Elements to
  * change language to the new locale.
  * @property assets - An array of asset ids or assets that contain localization data in the expected format. I18n will automatically load
  * translations from these assets as the assets are loaded and it will also automatically unload translations if the assets get removed or unloaded at runtime.
  * @param app - The application.
  */
@js.native
trait I18n
  extends StObject
     with EventHandler {
  
  /**
    * Adds localization data. If the locale and key for a translation already exists it will be overwritten.
    * @example
    * this.app.i18n.addData({
    *     header: {
    *         version: 1
    *     },
    *     data: [{
    *         info: {
    *             locale: 'en-US'
    *         },
    *         messages: {
    *             "key": "translation",
    *             // The number of plural forms depends on the locale. See the manual for more information.
    *             "plural_key": ["one item", "more than one items"]
    *         }
    *     }, {
    *         info: {
    *             locale: 'fr-FR'
    *         },
    *         messages: {
    *             // ...
    *         }
    *     }]
    * });
    * @param data - The localization data. See example for the expected format of the data.
    */
  def addData(data: js.Any): Unit = js.native
  
  /**
    * An array of asset ids or assets that contain localization data in the expected format. I18n will automatically load
    translations from these assets as the assets are loaded and it will also automatically unload translations if the assets get removed or unloaded at runtime.
    */
  var assets: js.Array[Asset | Double] = js.native
  
  /**
    * Frees up memory.
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns the first available locale based on the desired locale specified. First
    * tries to find the desired locale and then tries to find an alternative locale based on the language.
    * @param desiredLocale - The desired locale e.g. En-US.
    * @param availableLocales - A dictionary where each key is an available locale.
    * @returns The locale found or if no locale is available returns the default en-US locale.
    */
  def findAvailableLocale(desiredLocale: String, availableLocales: js.Any): String = js.native
  
  /**
    * Returns the pluralized translation for the specified key, number n and locale. If the locale is not specified
    * it will use the current locale.
    * @example
    * // manually replace {number} in the resulting translation with our number
    * var localized = this.app.i18n.getPluralText('{number} apples', number).replace("{number}", number);
    * @param key - The localization key.
    * @param n - The number used to determine which plural form to use. E.g. For the phrase "5 Apples" n equals 5.
    * @param [locale] - The desired locale.
    * @returns The translated text. If no translations are found at all for the locale then it will return
    * the en-US translation. If no translation exists for that key then it will return the localization key.
    */
  def getPluralText(key: String, n: Double): String = js.native
  def getPluralText(key: String, n: Double, locale: String): String = js.native
  
  /**
    * Returns the translation for the specified key and locale. If the locale is not specified
    * it will use the current locale.
    * @example
    * var localized = this.app.i18n.getText('localization-key');
    * var localizedFrench = this.app.i18n.getText('localization-key', 'fr-FR');
    * @param key - The localization key.
    * @param [locale] - The desired locale.
    * @returns The translated text. If no translations are found at all for the locale then it will return
    * the en-US translation. If no translation exists for that key then it will return the localization key.
    */
  def getText(key: String): String = js.native
  def getText(key: String, locale: String): String = js.native
  
  /**
    * The current locale for example "en-US". Changing the locale will raise an event which will cause localized Text Elements to
    change language to the new locale.
    */
  var locale: String = js.native
  
  /**
    * Removes localization data.
    * @param data - The localization data. The data is expected to be in the same format as {@link pc.I18n#addData}.
    */
  def removeData(data: js.Any): Unit = js.native
}
