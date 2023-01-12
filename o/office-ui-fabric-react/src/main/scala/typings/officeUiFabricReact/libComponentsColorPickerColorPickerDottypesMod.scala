package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libUtilitiesColorInterfacesMod.IColor
import typings.officeUiFabricReact.officeUiFabricReactStrings.alpha
import typings.officeUiFabricReact.officeUiFabricReactStrings.none
import typings.officeUiFabricReact.officeUiFabricReactStrings.transparency
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsColorPickerColorPickerDottypesMod {
  
  trait IColorPicker extends StObject {
    
    /** The currently selected color. */
    var color: IColor
  }
  object IColorPicker {
    
    inline def apply(color: IColor): IColorPicker = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorPicker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IColorPicker] (val x: Self) extends AnyVal {
      
      inline def setColor(value: IColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
  
  trait IColorPickerProps extends StObject {
    
    /**
      * Label for the alpha textfield.
      * @defaultvalue Alpha
      * @deprecated Use `strings`
      */
    var alphaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to hide the alpha (or transparency) slider and text field.
      * @deprecated Use `alphaType: 'none'`
      */
    var alphaSliderHidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * `alpha` (the default) means display a slider and text field for editing alpha values.
      * `transparency` also displays a slider and text field but for editing transparency values.
      * `none` hides these controls.
      *
      * Alpha represents the opacity of the color, whereas transparency represents the transparentness
      * of the color: i.e. a 30% transparent color has 70% opaqueness.
      *
      * @defaultvalue 'alpha'
      */
    var alphaType: js.UndefOr[alpha | transparency | none] = js.undefined
    
    /**
      * Label for the blue text field.
      * @defaultvalue Blue
      * @deprecated Use `strings`
      */
    var blueLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Additional CSS class(es) to apply to the ColorPicker.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Object or CSS-compatible string to describe the color.
      */
    var color: IColor | String
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IColorPicker]] = js.undefined
    
    /**
      * Label for the green text field.
      * @defaultvalue Green
      * @deprecated Use `strings`
      */
    var greenLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Label for the hex text field.
      * @defaultvalue Hex
      * @deprecated Use `strings`
      */
    var hexLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Callback for when the user changes the color.
      * (Not called when the color is changed via props.)
      */
    var onChange: js.UndefOr[
        js.Function2[/* ev */ SyntheticEvent[HTMLElement, Event], /* color */ IColor, Unit]
      ] = js.undefined
    
    /**
      * Label for the red text field.
      * @defaultvalue Red
      * @deprecated Use `strings`
      */
    var redLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to show color preview box.
      * @defaultvalue false
      */
    var showPreview: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Labels for elements within the ColorPicker. Defaults are provided in English only.
      */
    var strings: js.UndefOr[IColorPickerStrings] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles]] = js.undefined
    
    /**
      * Theme (provided through customization).
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IColorPickerProps {
    
    inline def apply(color: IColor | String): IColorPickerProps = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorPickerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IColorPickerProps] (val x: Self) extends AnyVal {
      
      inline def setAlphaLabel(value: String): Self = StObject.set(x, "alphaLabel", value.asInstanceOf[js.Any])
      
      inline def setAlphaLabelUndefined: Self = StObject.set(x, "alphaLabel", js.undefined)
      
      inline def setAlphaSliderHidden(value: Boolean): Self = StObject.set(x, "alphaSliderHidden", value.asInstanceOf[js.Any])
      
      inline def setAlphaSliderHiddenUndefined: Self = StObject.set(x, "alphaSliderHidden", js.undefined)
      
      inline def setAlphaType(value: alpha | transparency | none): Self = StObject.set(x, "alphaType", value.asInstanceOf[js.Any])
      
      inline def setAlphaTypeUndefined: Self = StObject.set(x, "alphaType", js.undefined)
      
      inline def setBlueLabel(value: String): Self = StObject.set(x, "blueLabel", value.asInstanceOf[js.Any])
      
      inline def setBlueLabelUndefined: Self = StObject.set(x, "blueLabel", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: IColor | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setComponentRef(value: IRefObject[IColorPicker]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IColorPicker | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setGreenLabel(value: String): Self = StObject.set(x, "greenLabel", value.asInstanceOf[js.Any])
      
      inline def setGreenLabelUndefined: Self = StObject.set(x, "greenLabel", js.undefined)
      
      inline def setHexLabel(value: String): Self = StObject.set(x, "hexLabel", value.asInstanceOf[js.Any])
      
      inline def setHexLabelUndefined: Self = StObject.set(x, "hexLabel", js.undefined)
      
      inline def setOnChange(value: (/* ev */ SyntheticEvent[HTMLElement, Event], /* color */ IColor) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRedLabel(value: String): Self = StObject.set(x, "redLabel", value.asInstanceOf[js.Any])
      
      inline def setRedLabelUndefined: Self = StObject.set(x, "redLabel", js.undefined)
      
      inline def setShowPreview(value: Boolean): Self = StObject.set(x, "showPreview", value.asInstanceOf[js.Any])
      
      inline def setShowPreviewUndefined: Self = StObject.set(x, "showPreview", js.undefined)
      
      inline def setStrings(value: IColorPickerStrings): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IColorPickerStyleProps => DeepPartial[IColorPickerStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IColorPickerStrings extends StObject {
    
    /**
      * Label for the alpha text field.
      * Also used as the aria label for the alpha slider if `alphaAriaLabel` is not provided.
      * @defaultvalue Alpha
      */
    var alpha: js.UndefOr[String] = js.undefined
    
    /**
      * Customized aria-label for the alpha slider.
      */
    var alphaAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Label for the blue text field.
      * @defaultvalue Blue
      */
    var blue: js.UndefOr[String] = js.undefined
    
    /**
      * Label for the green text field.
      * @defaultvalue Green
      */
    var green: js.UndefOr[String] = js.undefined
    
    /**
      * Label for the hex text field.
      * @defaultvalue Hex
      */
    var hex: js.UndefOr[String] = js.undefined
    
    /**
      * Aria label for the hue slider.
      * @deprecated Use `hueAriaLabel`
      */
    var hue: js.UndefOr[String] = js.undefined
    
    /**
      * Aria label for the hue slider.
      * @defaultvalue Hue
      */
    var hueAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Label for the red text field.
      * @defaultvalue Red
      */
    var red: js.UndefOr[String] = js.undefined
    
    /**
      * Accessible label for the root of the color picker region.
      * The string should contain a placeholder `{0}` for the currently selected color.
      * @defaultvalue `'Color picker, {0} selected.'`
      */
    var rootAriaLabelFormat: js.UndefOr[String] = js.undefined
    
    /**
      * Detailed description for how to use the color rectangle. Moving the thumb horizontally adjusts
      * saturation and moving it vertically adjusts value (essentially, brightness).
      * @defaultvalue 'Use left and right arrow keys to set saturation. Use up and down arrow keys to set brightness.'
      */
    var svAriaDescription: js.UndefOr[String] = js.undefined
    
    /**
      * Aria label for the color rectangle, which adjusts saturation and value (brightness).
      * @defaultvalue 'Saturation and brightness'
      */
    var svAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Format string for the current values of the color rectangle.
      * The string must include descriptions and two placeholders for the current values:
      * `{0}` for saturation and `{1}` for value/brightness.
      * @defaultvalue `'Saturation {0} brightness {1}'`
      */
    var svAriaValueFormat: js.UndefOr[String] = js.undefined
    
    /**
      * Label for the transparency text field.
      * @defaultvalue Transparency
      */
    var transparency: js.UndefOr[String] = js.undefined
    
    /**
      * Customized aria-label for the transparency slider.
      */
    var transparencyAriaLabel: js.UndefOr[String] = js.undefined
  }
  object IColorPickerStrings {
    
    inline def apply(): IColorPickerStrings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColorPickerStrings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IColorPickerStrings] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: String): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaAriaLabel(value: String): Self = StObject.set(x, "alphaAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setAlphaAriaLabelUndefined: Self = StObject.set(x, "alphaAriaLabel", js.undefined)
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setBlue(value: String): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
      
      inline def setGreen(value: String): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
      
      inline def setHue(value: String): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      inline def setHueAriaLabel(value: String): Self = StObject.set(x, "hueAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setHueAriaLabelUndefined: Self = StObject.set(x, "hueAriaLabel", js.undefined)
      
      inline def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
      
      inline def setRed(value: String): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
      
      inline def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
      
      inline def setRootAriaLabelFormat(value: String): Self = StObject.set(x, "rootAriaLabelFormat", value.asInstanceOf[js.Any])
      
      inline def setRootAriaLabelFormatUndefined: Self = StObject.set(x, "rootAriaLabelFormat", js.undefined)
      
      inline def setSvAriaDescription(value: String): Self = StObject.set(x, "svAriaDescription", value.asInstanceOf[js.Any])
      
      inline def setSvAriaDescriptionUndefined: Self = StObject.set(x, "svAriaDescription", js.undefined)
      
      inline def setSvAriaLabel(value: String): Self = StObject.set(x, "svAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setSvAriaLabelUndefined: Self = StObject.set(x, "svAriaLabel", js.undefined)
      
      inline def setSvAriaValueFormat(value: String): Self = StObject.set(x, "svAriaValueFormat", value.asInstanceOf[js.Any])
      
      inline def setSvAriaValueFormatUndefined: Self = StObject.set(x, "svAriaValueFormat", js.undefined)
      
      inline def setTransparency(value: String): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
      
      inline def setTransparencyAriaLabel(value: String): Self = StObject.set(x, "transparencyAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setTransparencyAriaLabelUndefined: Self = StObject.set(x, "transparencyAriaLabel", js.undefined)
      
      inline def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.types.IColorPickerProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.types.IColorPickerProps, 'className' | 'alphaType'> */
  trait IColorPickerStyleProps extends StObject {
    
    var alphaType: js.UndefOr[alpha | transparency | none] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var theme: ITheme
  }
  object IColorPickerStyleProps {
    
    inline def apply(theme: ITheme): IColorPickerStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorPickerStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IColorPickerStyleProps] (val x: Self) extends AnyVal {
      
      inline def setAlphaType(value: alpha | transparency | none): Self = StObject.set(x, "alphaType", value.asInstanceOf[js.Any])
      
      inline def setAlphaTypeUndefined: Self = StObject.set(x, "alphaType", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IColorPickerStyles extends StObject {
    
    /**
      * Style set for the panel element that contains the color rectangle
      */
    var colorRectangle: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Color Square
      */
    var colorSquare: js.UndefOr[IStyle] = js.undefined
    
    /**
      * flexContainer
      */
    var flexContainer: js.UndefOr[IStyle] = js.undefined
    
    /**
      * flexPreviewBox
      */
    var flexPreviewBox: js.UndefOr[IStyle] = js.undefined
    
    /**
      * flexSlider
      */
    var flexSlider: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for each text field input.
      */
    var input: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the panel element that contains the color rectangle, color sliders and inputs .
      */
    var panel: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the root element.
      */
    var root: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the table element that contains the color sliders and inputs.
      */
    var table: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the table cell that contains the alpha or transparency label.
      */
    var tableAlphaCell: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the table header that contains the labels.
      */
    var tableHeader: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the table cell that contains the hex label.
      */
    var tableHexCell: js.UndefOr[IStyle] = js.undefined
  }
  object IColorPickerStyles {
    
    inline def apply(): IColorPickerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColorPickerStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IColorPickerStyles] (val x: Self) extends AnyVal {
      
      inline def setColorRectangle(value: IStyle): Self = StObject.set(x, "colorRectangle", value.asInstanceOf[js.Any])
      
      inline def setColorRectangleNull: Self = StObject.set(x, "colorRectangle", null)
      
      inline def setColorRectangleUndefined: Self = StObject.set(x, "colorRectangle", js.undefined)
      
      inline def setColorSquare(value: IStyle): Self = StObject.set(x, "colorSquare", value.asInstanceOf[js.Any])
      
      inline def setColorSquareNull: Self = StObject.set(x, "colorSquare", null)
      
      inline def setColorSquareUndefined: Self = StObject.set(x, "colorSquare", js.undefined)
      
      inline def setFlexContainer(value: IStyle): Self = StObject.set(x, "flexContainer", value.asInstanceOf[js.Any])
      
      inline def setFlexContainerNull: Self = StObject.set(x, "flexContainer", null)
      
      inline def setFlexContainerUndefined: Self = StObject.set(x, "flexContainer", js.undefined)
      
      inline def setFlexPreviewBox(value: IStyle): Self = StObject.set(x, "flexPreviewBox", value.asInstanceOf[js.Any])
      
      inline def setFlexPreviewBoxNull: Self = StObject.set(x, "flexPreviewBox", null)
      
      inline def setFlexPreviewBoxUndefined: Self = StObject.set(x, "flexPreviewBox", js.undefined)
      
      inline def setFlexSlider(value: IStyle): Self = StObject.set(x, "flexSlider", value.asInstanceOf[js.Any])
      
      inline def setFlexSliderNull: Self = StObject.set(x, "flexSlider", null)
      
      inline def setFlexSliderUndefined: Self = StObject.set(x, "flexSlider", js.undefined)
      
      inline def setInput(value: IStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputNull: Self = StObject.set(x, "input", null)
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setPanel(value: IStyle): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      inline def setPanelNull: Self = StObject.set(x, "panel", null)
      
      inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setTable(value: IStyle): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableAlphaCell(value: IStyle): Self = StObject.set(x, "tableAlphaCell", value.asInstanceOf[js.Any])
      
      inline def setTableAlphaCellNull: Self = StObject.set(x, "tableAlphaCell", null)
      
      inline def setTableAlphaCellUndefined: Self = StObject.set(x, "tableAlphaCell", js.undefined)
      
      inline def setTableHeader(value: IStyle): Self = StObject.set(x, "tableHeader", value.asInstanceOf[js.Any])
      
      inline def setTableHeaderNull: Self = StObject.set(x, "tableHeader", null)
      
      inline def setTableHeaderUndefined: Self = StObject.set(x, "tableHeader", js.undefined)
      
      inline def setTableHexCell(value: IStyle): Self = StObject.set(x, "tableHexCell", value.asInstanceOf[js.Any])
      
      inline def setTableHexCellNull: Self = StObject.set(x, "tableHexCell", null)
      
      inline def setTableHexCellUndefined: Self = StObject.set(x, "tableHexCell", js.undefined)
      
      inline def setTableNull: Self = StObject.set(x, "table", null)
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
}
