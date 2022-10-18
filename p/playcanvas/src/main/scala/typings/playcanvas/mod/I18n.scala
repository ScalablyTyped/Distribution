package typings.playcanvas.mod

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
@js.native
trait I18n extends EventHandler {
  
  var _app: AppBase = js.native
  
  var _assets: js.Array[Any] = js.native
  
  def _findFallbackLocale(locale: Any, lang: Any): Any = js.native
  
  var _lang: Any = js.native
  
  var _locale: Any = js.native
  
  def _onAssetAdd(asset: Any): Unit = js.native
  
  def _onAssetChange(asset: Any): Unit = js.native
  
  def _onAssetLoad(asset: Any): Unit = js.native
  
  def _onAssetRemove(asset: Any): Unit = js.native
  
  def _onAssetUnload(asset: Any): Unit = js.native
  
  var _parser: I18nParser = js.native
  
  var _pluralFn: Any = js.native
  
  /**
    * Adds localization data. If the locale and key for a translation already exists it will be
    * overwritten.
    *
    * @param {object} data - The localization data. See example for the expected format of the
    * data.
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
    */
  def addData(data: js.Object): Unit = js.native
  
  def assets: js.Array[Any] = js.native
  /**
    * An array of asset ids or assets that contain localization data in the expected format. I18n
    * will automatically load translations from these assets as the assets are loaded and it will
    * also automatically unload translations if the assets get removed or unloaded at runtime.
    *
    * @type {number[]|Asset[]}
    */
  def assets_=(arg: js.Array[Any]): Unit = js.native
  
  /**
    * Frees up memory.
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns the first available locale based on the desired locale specified. First tries to
    * find the desired locale in the loaded translations and then tries to find an alternative
    * locale based on the language.
    *
    * @param {string} desiredLocale - The desired locale e.g. en-US.
    * @returns {string} The locale found or if no locale is available returns the default en-US
    * locale.
    * @example
    * var locale = this.app.i18n.getText('en-US');
    */
  def findAvailableLocale(desiredLocale: String): String = js.native
  
  /**
    * Returns the pluralized translation for the specified key, number n and locale. If the locale
    * is not specified it will use the current locale.
    *
    * @param {string} key - The localization key.
    * @param {number} n - The number used to determine which plural form to use. E.g. For the
    * phrase "5 Apples" n equals 5.
    * @param {string} [locale] - The desired locale.
    * @returns {string} The translated text. If no translations are found at all for the locale
    * then it will return the en-US translation. If no translation exists for that key then it
    * will return the localization key.
    * @example
    * // manually replace {number} in the resulting translation with our number
    * var localized = this.app.i18n.getPluralText('{number} apples', number).replace("{number}", number);
    */
  def getPluralText(key: String, n: Double): String = js.native
  def getPluralText(key: String, n: Double, locale: String): String = js.native
  
  /**
    * Returns the translation for the specified key and locale. If the locale is not specified it
    * will use the current locale.
    *
    * @param {string} key - The localization key.
    * @param {string} [locale] - The desired locale.
    * @returns {string} The translated text. If no translations are found at all for the locale
    * then it will return the en-US translation. If no translation exists for that key then it will
    * return the localization key.
    * @example
    * var localized = this.app.i18n.getText('localization-key');
    * var localizedFrench = this.app.i18n.getText('localization-key', 'fr-FR');
    */
  def getText(key: String): String = js.native
  def getText(key: String, locale: String): String = js.native
  
  def locale: Any = js.native
  /**
    * The current locale for example "en-US". Changing the locale will raise an event which will
    * cause localized Text Elements to change language to the new locale.
    *
    * @type {string}
    */
  def locale_=(arg: Any): Unit = js.native
  
  /**
    * Removes localization data.
    *
    * @param {object} data - The localization data. The data is expected to be in the same format
    * as {@link I18n#addData}.
    */
  def removeData(data: js.Object): Unit = js.native
}
