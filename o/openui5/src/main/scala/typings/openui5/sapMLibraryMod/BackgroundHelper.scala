package typings.openui5.sapMLibraryMod

import typings.openui5.float
import typings.openui5.sapMLibraryMod.^
import typings.openui5.sapUiCoreLibraryMod.CSSColor
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiCoreRenderManagerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @since 1.12
  * Protected:  DO NOT USE IN APPLICATIONS (only for related classes in the framework)
  *
  * Helper for rendering themable background.
  */
@js.native
trait BackgroundHelper extends StObject {
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Adds CSS classes and styles to the given RenderManager, depending on the given configuration for background
    * color and background image. To be called by control renderers supporting the global themable background
    * image within their root tag, before they call openEnd, voidEnd, writeClasses() and writeStyles().
    */
  def addBackgroundColorStyles(/**
    * The RenderManager
    */
  rm: default): Unit = js.native
  def addBackgroundColorStyles(
    /**
    * The RenderManager
    */
  rm: default,
    /**
    * A configured custom background color for the control, if any
    */
  sBgColor: Unit,
    /**
    * The configured custom background image for the control, if any
    */
  sBgImgUrl: URI
  ): Unit = js.native
  def addBackgroundColorStyles(
    /**
    * The RenderManager
    */
  rm: default,
    /**
    * A configured custom background color for the control, if any
    */
  sBgColor: CSSColor
  ): Unit = js.native
  def addBackgroundColorStyles(
    /**
    * The RenderManager
    */
  rm: default,
    /**
    * A configured custom background color for the control, if any
    */
  sBgColor: CSSColor,
    /**
    * The configured custom background image for the control, if any
    */
  sBgImgUrl: URI
  ): Unit = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Renders an HTML tag into the given RenderManager which carries the background image which is either configured
    * and given or coming from the current theme. Should be called right after the opening root tag has been
    * completed, so this is the first child element inside the control.
    */
  def renderBackgroundImageTag(
    /**
    * The RenderManager
    */
  rm: default,
    /**
    * Control within which the tag will be rendered; its ID will be used to generate the element ID
    */
  oControl: typings.openui5.sapUiCoreControlMod.default,
    /**
    * A CSS class or an array of CSS classes to add to the element
    */
  vCssClass: String
  ): Unit = js.native
  def renderBackgroundImageTag(
    /**
    * The RenderManager
    */
  rm: default,
    /**
    * Control within which the tag will be rendered; its ID will be used to generate the element ID
    */
  oControl: typings.openui5.sapUiCoreControlMod.default,
    /**
    * A CSS class or an array of CSS classes to add to the element
    */
  vCssClass: String,
    /**
    * The image of a configured background image; if this is not given, the theme background will be used and
    * also the other settings are ignored.
    */
  sBgImgUrl: Unit,
    /**
    * Whether the background image should be repeated/tiled (or stretched)
    */
  bRepeat: Boolean
  ): Unit = js.native
  def renderBackgroundImageTag(
    /**
    * The RenderManager
    */
  rm: default,
    /**
    * Control within which the tag will be rendered; its ID will be used to generate the element ID
    */
  oControl: typings.openui5.sapUiCoreControlMod.default,
    /**
    * A CSS class or an array of CSS classes to add to the element
    */
  vCssClass: String,
    /**
    * The image of a configured background image; if this is not given, the theme background will be used and
    * also the other settings are ignored.
    */
  sBgImgUrl: Unit,
    /**
    * Whether the background image should be repeated/tiled (or stretched)
    */
  bRepeat: Boolean,
    /**
    * The background image opacity, if any
    */
  fOpacity: float
  ): Unit = js.native
  def renderBackgroundImageTag(
    /**
    * The RenderManager
    */
  rm: default,
    /**
    * Control within which the tag will be rendered; its ID will be used to generate the element ID
    */
  oControl: typings.openui5.sapUiCoreControlMod.default,
    /**
    * A CSS class or an array of CSS classes to add to the element
    */
  vCssClass: String,
    /**
    * The image of a configured background image; if this is not given, the theme background will be used and
    * also the other settings are ignored.
    */
  sBgImgUrl: Unit,
    /**
    * Whether the background image should be repeated/tiled (or stretched)
    */
  bRepeat: Unit,
    /**
    * The background image opacity, if any
    */
  fOpacity: float
  ): Unit = js.native
  def renderBackgroundImageTag(
    /**
    * The RenderManager
    */
  rm: default,
    /**
    * Control within which the tag will be rendered; its ID will be used to generate the element ID
    */
  oControl: typings.openui5.sapUiCoreControlMod.default,
    /**
    * A CSS class or an array of CSS classes to add to the element
    */
  vCssClass: String,
    /**
    * The image of a configured background image; if this is not given, the theme background will be used and
    * also the other settings are ignored.
    */
  sBgImgUrl: URI
  ): Unit = js.native
  def renderBackgroundImageTag(
    /**
    * The RenderManager
    */
  rm: default,
    /**
    * Control within which the tag will be rendered; its ID will be used to generate the element ID
    */
  oControl: typings.openui5.sapUiCoreControlMod.default,
    /**
    * A CSS class or an array of CSS classes to add to the element
    */
  vCssClass: String,
    /**
    * The image of a configured background image; if this is not given, the theme background will be used and
    * also the other settings are ignored.
    */
  sBgImgUrl: URI,
    /**
    * Whether the background image should be repeated/tiled (or stretched)
    */
  bRepeat: Boolean
  ): Unit = js.native
  def renderBackgroundImageTag(
    /**
    * The RenderManager
    */
  rm: default,
    /**
    * Control within which the tag will be rendered; its ID will be used to generate the element ID
    */
  oControl: typings.openui5.sapUiCoreControlMod.default,
    /**
    * A CSS class or an array of CSS classes to add to the element
    */
  vCssClass: String,
    /**
    * The image of a configured background image; if this is not given, the theme background will be used and
    * also the other settings are ignored.
    */
  sBgImgUrl: URI,
    /**
    * Whether the background image should be repeated/tiled (or stretched)
    */
  bRepeat: Boolean,
    /**
    * The background image opacity, if any
    */
  fOpacity: float
  ): Unit = js.native
  def renderBackgroundImageTag(
    /**
    * The RenderManager
    */
  rm: default,
    /**
    * Control within which the tag will be rendered; its ID will be used to generate the element ID
    */
  oControl: typings.openui5.sapUiCoreControlMod.default,
    /**
    * A CSS class or an array of CSS classes to add to the element
    */
  vCssClass: String,
    /**
    * The image of a configured background image; if this is not given, the theme background will be used and
    * also the other settings are ignored.
    */
  sBgImgUrl: URI,
    /**
    * Whether the background image should be repeated/tiled (or stretched)
    */
  bRepeat: Unit,
    /**
    * The background image opacity, if any
    */
  fOpacity: float
  ): Unit = js.native
  def renderBackgroundImageTag(
    /**
    * The RenderManager
    */
  rm: default,
    /**
    * Control within which the tag will be rendered; its ID will be used to generate the element ID
    */
  oControl: typings.openui5.sapUiCoreControlMod.default,
    /**
    * A CSS class or an array of CSS classes to add to the element
    */
  vCssClass: js.Array[String]
  ): Unit = js.native
  def renderBackgroundImageTag(
    /**
    * The RenderManager
    */
  rm: default,
    /**
    * Control within which the tag will be rendered; its ID will be used to generate the element ID
    */
  oControl: typings.openui5.sapUiCoreControlMod.default,
    /**
    * A CSS class or an array of CSS classes to add to the element
    */
  vCssClass: js.Array[String],
    /**
    * The image of a configured background image; if this is not given, the theme background will be used and
    * also the other settings are ignored.
    */
  sBgImgUrl: Unit,
    /**
    * Whether the background image should be repeated/tiled (or stretched)
    */
  bRepeat: Boolean
  ): Unit = js.native
  def renderBackgroundImageTag(
    /**
    * The RenderManager
    */
  rm: default,
    /**
    * Control within which the tag will be rendered; its ID will be used to generate the element ID
    */
  oControl: typings.openui5.sapUiCoreControlMod.default,
    /**
    * A CSS class or an array of CSS classes to add to the element
    */
  vCssClass: js.Array[String],
    /**
    * The image of a configured background image; if this is not given, the theme background will be used and
    * also the other settings are ignored.
    */
  sBgImgUrl: Unit,
    /**
    * Whether the background image should be repeated/tiled (or stretched)
    */
  bRepeat: Boolean,
    /**
    * The background image opacity, if any
    */
  fOpacity: float
  ): Unit = js.native
  def renderBackgroundImageTag(
    /**
    * The RenderManager
    */
  rm: default,
    /**
    * Control within which the tag will be rendered; its ID will be used to generate the element ID
    */
  oControl: typings.openui5.sapUiCoreControlMod.default,
    /**
    * A CSS class or an array of CSS classes to add to the element
    */
  vCssClass: js.Array[String],
    /**
    * The image of a configured background image; if this is not given, the theme background will be used and
    * also the other settings are ignored.
    */
  sBgImgUrl: Unit,
    /**
    * Whether the background image should be repeated/tiled (or stretched)
    */
  bRepeat: Unit,
    /**
    * The background image opacity, if any
    */
  fOpacity: float
  ): Unit = js.native
  def renderBackgroundImageTag(
    /**
    * The RenderManager
    */
  rm: default,
    /**
    * Control within which the tag will be rendered; its ID will be used to generate the element ID
    */
  oControl: typings.openui5.sapUiCoreControlMod.default,
    /**
    * A CSS class or an array of CSS classes to add to the element
    */
  vCssClass: js.Array[String],
    /**
    * The image of a configured background image; if this is not given, the theme background will be used and
    * also the other settings are ignored.
    */
  sBgImgUrl: URI
  ): Unit = js.native
  def renderBackgroundImageTag(
    /**
    * The RenderManager
    */
  rm: default,
    /**
    * Control within which the tag will be rendered; its ID will be used to generate the element ID
    */
  oControl: typings.openui5.sapUiCoreControlMod.default,
    /**
    * A CSS class or an array of CSS classes to add to the element
    */
  vCssClass: js.Array[String],
    /**
    * The image of a configured background image; if this is not given, the theme background will be used and
    * also the other settings are ignored.
    */
  sBgImgUrl: URI,
    /**
    * Whether the background image should be repeated/tiled (or stretched)
    */
  bRepeat: Boolean
  ): Unit = js.native
  def renderBackgroundImageTag(
    /**
    * The RenderManager
    */
  rm: default,
    /**
    * Control within which the tag will be rendered; its ID will be used to generate the element ID
    */
  oControl: typings.openui5.sapUiCoreControlMod.default,
    /**
    * A CSS class or an array of CSS classes to add to the element
    */
  vCssClass: js.Array[String],
    /**
    * The image of a configured background image; if this is not given, the theme background will be used and
    * also the other settings are ignored.
    */
  sBgImgUrl: URI,
    /**
    * Whether the background image should be repeated/tiled (or stretched)
    */
  bRepeat: Boolean,
    /**
    * The background image opacity, if any
    */
  fOpacity: float
  ): Unit = js.native
  def renderBackgroundImageTag(
    /**
    * The RenderManager
    */
  rm: default,
    /**
    * Control within which the tag will be rendered; its ID will be used to generate the element ID
    */
  oControl: typings.openui5.sapUiCoreControlMod.default,
    /**
    * A CSS class or an array of CSS classes to add to the element
    */
  vCssClass: js.Array[String],
    /**
    * The image of a configured background image; if this is not given, the theme background will be used and
    * also the other settings are ignored.
    */
  sBgImgUrl: URI,
    /**
    * Whether the background image should be repeated/tiled (or stretched)
    */
  bRepeat: Unit,
    /**
    * The background image opacity, if any
    */
  fOpacity: float
  ): Unit = js.native
}
object BackgroundHelper {
  
  inline def apply: BackgroundHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("BackgroundHelper").asInstanceOf[BackgroundHelper]
}
