package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.SelectFileInputWidget.Props
import typings.oojsUi.OO.ui.SelectFileInputWidget.Prototype
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SelectFileInputWidgets allow for selecting files, using &lt;input type="file"&gt;. These
  * widgets can be configured with {@link OO.ui.mixin.IconElement icons}, {@link OO.ui.mixin.IndicatorElement indicators}
  * and {@link OO.ui.mixin.TitledElement titles}.
  * Please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets)
  * for more information and examples.
  *
  * SelectFileInputWidgets must be used in HTML forms, as getValue only returns the filename.
  *
  *     // A file select input widget.
  *     var selectFile = new OO.ui.SelectFileInputWidget();
  *     $( document.body ).append( selectFile.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.SelectFileInputWidget
  */
@js.native
trait SelectFileInputWidget
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
object SelectFileInputWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.RequiredElement.ConfigOptions {
    
    /** MIME types to accept. null accepts all types. */
    var accept: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /** Config to pass to select file button. */
    var button: js.UndefOr[typings.oojsUi.OO.ui.ButtonWidget.ConfigOptions] = js.undefined
    
    /** Icon to show next to file info */
    var icon: js.UndefOr[Icon | (Record[String, Icon]) | Null] = js.undefined
    
    /** Allow multiple files to be selected. */
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /** Text to display when no file is selected. */
    var placeholder: js.UndefOr[String] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setAccept(value: js.Array[String]): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptNull: Self = StObject.set(x, "accept", null)
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAcceptVarargs(value: String*): Self = StObject.set(x, "accept", js.Array(value*))
      
      inline def setButton(value: typings.oojsUi.OO.ui.ButtonWidget.ConfigOptions): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setIcon(value: Icon | (Record[String, Icon])): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[SelectFileInputWidget]
       with Instantiable1[/* config */ ConfigOptions, SelectFileInputWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.InputWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.InputWidget.Constructor = js.native
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.Props
       with typings.oojsUi.OO.ui.mixin.RequiredElement.Props
  object Props {
    
    inline def apply(
      $accessKeyed: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $input: JQuery[HTMLElement],
      $required: JQuery[HTMLElement],
      $tabIndexed: JQuery[HTMLElement],
      $titled: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($accessKeyed = $accessKeyed.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $input = $input.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $tabIndexed = $tabIndexed.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.Prototype
       with typings.oojsUi.OO.ui.mixin.RequiredElement.Prototype {
    
    /**
      * Get the filename of the currently selected file.
      *
      * @return Filename
      */
    def getFilename(): String = js.native
    
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
  
  type Static = typings.oojsUi.OO.ui.InputWidget.Static
}
