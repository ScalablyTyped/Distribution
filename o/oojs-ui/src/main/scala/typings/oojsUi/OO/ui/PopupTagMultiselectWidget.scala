package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.PopupTagMultiselectWidget.Props
import typings.oojsUi.OO.ui.PopupTagMultiselectWidget.Prototype
import typings.oojsUi.OO.ui.mixin.PopupElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PopupTagMultiselectWidget is a {@link OO.ui.TagMultiselectWidget OO.ui.TagMultiselectWidget}
  * intended to use a popup. The popup can be configured to have a default input to insert values
  * into the widget.
  *
  *     // A PopupTagMultiselectWidget.
  *     var widget = new OO.ui.PopupTagMultiselectWidget();
  *     $( document.body ).append( widget.$element );
  *
  *     // Example: A PopupTagMultiselectWidget with an external popup.
  *     var popupInput = new OO.ui.TextInputWidget(),
  *         widget = new OO.ui.PopupTagMultiselectWidget( {
  *            popupInput: popupInput,
  *            popup: {
  *               $content: popupInput.$element
  *            }
  *         } );
  *     $( document.body ).append( widget.$element );
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.PopupTagMultiselectWidget
  */
@js.native
trait PopupTagMultiselectWidget
  extends StObject
     with Props
     with Prototype {
  
  /**
    * Get an ID of a labelable node which is part of this widget, if any, to be used for `<label for>`
    * value.
    *
    * If this function returns null, the widget should have a meaningful {@link simulateLabelClick} method
    * instead.
    *
    * @return The ID of the labelable element
    */
  /* InferMemberOverrides */
  override def getInputId(): String | Null = js.native
}
object PopupTagMultiselectWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.TagMultiselectWidget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.PopupElement.ConfigOptions {
    
    /**
      * An overlay for the popup.
      * See <https://www.mediawiki.org/wiki/OOUI/Concepts#Overlays>.
      */
    @JSName("$overlay")
    var $overlay: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /**
      * An input widget inside the popup that will be
      * focused when the popup is opened and will be used as replacement for the
      * general input in the widget.
      *
      * @deprecated
      */
    var popupInput: js.UndefOr[InputWidget] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$overlay(value: JQuery[HTMLElement]): Self = StObject.set(x, "$overlay", value.asInstanceOf[js.Any])
      
      inline def set$overlayUndefined: Self = StObject.set(x, "$overlay", js.undefined)
      
      inline def setPopupInput(value: InputWidget): Self = StObject.set(x, "popupInput", value.asInstanceOf[js.Any])
      
      inline def setPopupInputUndefined: Self = StObject.set(x, "popupInput", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[PopupTagMultiselectWidget]
       with Instantiable1[/* config */ ConfigOptions, PopupTagMultiselectWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.TagMultiselectWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.TagMultiselectWidget.Constructor = js.native
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.TagMultiselectWidget.Props {
    
    @JSName("$overlay")
    var $overlay: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply(
      $content: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $flagged: JQuery[HTMLElement],
      $group: JQuery[HTMLElement],
      $handle: JQuery[HTMLElement],
      $icon: JQuery[HTMLElement],
      $indicator: JQuery[HTMLElement],
      $overlay: JQuery[HTMLElement],
      $tabIndexed: JQuery[HTMLElement],
      $titled: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($content = $content.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $flagged = $flagged.asInstanceOf[js.Any], $group = $group.asInstanceOf[js.Any], $handle = $handle.asInstanceOf[js.Any], $icon = $icon.asInstanceOf[js.Any], $indicator = $indicator.asInstanceOf[js.Any], $overlay = $overlay.asInstanceOf[js.Any], $tabIndexed = $tabIndexed.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$overlay(value: JQuery[HTMLElement]): Self = StObject.set(x, "$overlay", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.TagMultiselectWidget.Prototype
       with PopupElement {
    
    /**
      * Add a tag by the popup value.
      * Whatever is responsible for setting the value in the popup should call
      * this method to add a tag, or use the regular methods like #addTag or
      * {@link setValue} directly.
      *
      * @param data The value of item
      * @param label The label of the tag. If not given, the data is used.
      */
    def addTagByPopupValue(data: String): Unit = js.native
    def addTagByPopupValue(data: String, label: String): Unit = js.native
    
    /**
      * Get an ID of a labelable node which is part of this widget, if any, to be used for `<label for>`
      * value.
      *
      * If this function returns null, the widget should have a meaningful {@link simulateLabelClick} method
      * instead.
      *
      * @return The ID of the labelable element
      */
    /* InferMemberOverrides */
    override def getInputId(): String | Null = js.native
    
    /**
      * Respond to popup input enter event
      */
    def onPopupInputEnter(): Unit = js.native
    
    /**
      * Respond to popup toggle event
      *
      * @param isVisible Popup is visible
      */
    def onPopupToggle(isVisible: Boolean): Unit = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.TagMultiselectWidget.Static
}
