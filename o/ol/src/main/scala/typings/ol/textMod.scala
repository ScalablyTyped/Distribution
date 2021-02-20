package typings.ol

import typings.ol.sizeMod.Size
import typings.ol.textPlacementMod.TextPlacement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("ol/style/Text", JSImport.Default)
  @js.native
  class default () extends Text {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var backgroundFill: js.UndefOr[typings.ol.fillMod.default] = js.native
    
    var backgroundStroke: js.UndefOr[typings.ol.strokeMod.default] = js.native
    
    var fill: js.UndefOr[typings.ol.fillMod.default] = js.native
    
    var font: js.UndefOr[String] = js.native
    
    var maxAngle: js.UndefOr[Double] = js.native
    
    var offsetX: js.UndefOr[Double] = js.native
    
    var offsetY: js.UndefOr[Double] = js.native
    
    var overflow: js.UndefOr[Boolean] = js.native
    
    var padding: js.UndefOr[js.Array[Double]] = js.native
    
    var placement: js.UndefOr[TextPlacement | String] = js.native
    
    var rotateWithView: js.UndefOr[Boolean] = js.native
    
    var rotation: js.UndefOr[Double] = js.native
    
    var scale: js.UndefOr[Double | Size] = js.native
    
    var stroke: js.UndefOr[typings.ol.strokeMod.default] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var textAlign: js.UndefOr[String] = js.native
    
    var textBaseline: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundFill(value: typings.ol.fillMod.default): Self = StObject.set(x, "backgroundFill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundFillUndefined: Self = StObject.set(x, "backgroundFill", js.undefined)
      
      @scala.inline
      def setBackgroundStroke(value: typings.ol.strokeMod.default): Self = StObject.set(x, "backgroundStroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundStrokeUndefined: Self = StObject.set(x, "backgroundStroke", js.undefined)
      
      @scala.inline
      def setFill(value: typings.ol.fillMod.default): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setMaxAngle(value: Double): Self = StObject.set(x, "maxAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAngleUndefined: Self = StObject.set(x, "maxAngle", js.undefined)
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      @scala.inline
      def setOverflow(value: Boolean): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      @scala.inline
      def setPlacement(value: TextPlacement | String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateWithViewUndefined: Self = StObject.set(x, "rotateWithView", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setScale(value: Double | Size): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setStroke(value: typings.ol.strokeMod.default): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextBaseline(value: String): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait Text extends StObject {
    
    /**
      * Get the background fill style for the text.
      */
    def getBackgroundFill(): typings.ol.fillMod.default = js.native
    
    /**
      * Get the background stroke style for the text.
      */
    def getBackgroundStroke(): typings.ol.strokeMod.default = js.native
    
    /**
      * Get the fill style for the text.
      */
    def getFill(): typings.ol.fillMod.default = js.native
    
    /**
      * Get the font name.
      */
    def getFont(): js.UndefOr[String] = js.native
    
    /**
      * Get the maximum angle between adjacent characters.
      */
    def getMaxAngle(): Double = js.native
    
    /**
      * Get the x-offset for the text.
      */
    def getOffsetX(): Double = js.native
    
    /**
      * Get the y-offset for the text.
      */
    def getOffsetY(): Double = js.native
    
    /**
      * Get the overflow configuration.
      */
    def getOverflow(): Boolean = js.native
    
    /**
      * Get the padding for the text.
      */
    def getPadding(): js.Array[Double] = js.native
    
    /**
      * Get the label placement.
      */
    def getPlacement(): TextPlacement | String = js.native
    
    /**
      * Determine whether the text rotates with the map.
      */
    def getRotateWithView(): js.UndefOr[Boolean] = js.native
    
    /**
      * Get the text rotation.
      */
    def getRotation(): js.UndefOr[Double] = js.native
    
    /**
      * Get the text scale.
      */
    def getScale(): js.UndefOr[Double | Size] = js.native
    
    /**
      * Get the symbolizer scale array.
      */
    def getScaleArray(): Size = js.native
    
    /**
      * Get the stroke style for the text.
      */
    def getStroke(): typings.ol.strokeMod.default = js.native
    
    /**
      * Get the text to be rendered.
      */
    def getText(): js.UndefOr[String] = js.native
    
    /**
      * Get the text alignment.
      */
    def getTextAlign(): js.UndefOr[String] = js.native
    
    /**
      * Get the text baseline.
      */
    def getTextBaseline(): js.UndefOr[String] = js.native
    
    /**
      * Set the background fill.
      */
    def setBackgroundFill(fill: typings.ol.fillMod.default): Unit = js.native
    
    /**
      * Set the background stroke.
      */
    def setBackgroundStroke(stroke: typings.ol.strokeMod.default): Unit = js.native
    
    /**
      * Set the fill.
      */
    def setFill(fill: typings.ol.fillMod.default): Unit = js.native
    
    /**
      * Set the font.
      */
    def setFont(): Unit = js.native
    def setFont(font: String): Unit = js.native
    
    /**
      * Set the maximum angle between adjacent characters.
      */
    def setMaxAngle(maxAngle: Double): Unit = js.native
    
    /**
      * Set the x offset.
      */
    def setOffsetX(offsetX: Double): Unit = js.native
    
    /**
      * Set the y offset.
      */
    def setOffsetY(offsetY: Double): Unit = js.native
    
    /**
      * Set the overflow property.
      */
    def setOverflow(overflow: Boolean): Unit = js.native
    
    /**
      * Set the padding ([top, right, bottom, left]).
      */
    def setPadding(padding: js.Array[Double]): Unit = js.native
    
    def setPlacement(placement: String): Unit = js.native
    /**
      * Set the text placement.
      */
    def setPlacement(placement: TextPlacement): Unit = js.native
    
    /**
      * Set whether to rotate the text with the view.
      */
    def setRotateWithView(rotateWithView: Boolean): Unit = js.native
    
    /**
      * Set the rotation.
      */
    def setRotation(): Unit = js.native
    def setRotation(rotation: Double): Unit = js.native
    
    /**
      * Set the scale.
      */
    def setScale(): Unit = js.native
    def setScale(scale: Double): Unit = js.native
    def setScale(scale: Size): Unit = js.native
    
    /**
      * Set the stroke.
      */
    def setStroke(stroke: typings.ol.strokeMod.default): Unit = js.native
    
    /**
      * Set the text.
      */
    def setText(): Unit = js.native
    def setText(text: String): Unit = js.native
    
    /**
      * Set the text alignment.
      */
    def setTextAlign(): Unit = js.native
    def setTextAlign(textAlign: String): Unit = js.native
    
    /**
      * Set the text baseline.
      */
    def setTextBaseline(): Unit = js.native
    def setTextBaseline(textBaseline: String): Unit = js.native
  }
}
