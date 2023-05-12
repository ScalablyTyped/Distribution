package typings.ol

import typings.ol.olStrings.declutter
import typings.ol.olStrings.none
import typings.ol.olStrings.obstacle
import typings.ol.sizeMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleCircleMod {
  
  /**
    * @typedef {Object} Options
    * @property {import("./Fill.js").default} [fill] Fill style.
    * @property {number} radius Circle radius.
    * @property {import("./Stroke.js").default} [stroke] Stroke style.
    * @property {Array<number>} [displacement=[0,0]] displacement
    * @property {number|import("../size.js").Size} [scale=1] Scale. A two dimensional scale will produce an ellipse.
    * Unless two dimensional scaling is required a better result may be obtained with an appropriate setting for `radius`.
    * @property {number} [rotation=0] Rotation in radians
    * (positive rotation clockwise, meaningful only when used in conjunction with a two dimensional scale).
    * @property {boolean} [rotateWithView=false] Whether to rotate the shape with the view
    * (meaningful only when used in conjunction with a two dimensional scale).
    * @property {"declutter"|"obstacle"|"none"|undefined} [declutterMode] Declutter mode
    */
  /**
    * @classdesc
    * Set circle style for vector features.
    * @api
    */
  @JSImport("ol/style/Circle", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends CircleStyle {
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Fill.js").default} [fill] Fill style.
    * @property {number} radius Circle radius.
    * @property {import("./Stroke.js").default} [stroke] Stroke style.
    * @property {Array<number>} [displacement=[0,0]] displacement
    * @property {number|import("../size.js").Size} [scale=1] Scale. A two dimensional scale will produce an ellipse.
    * Unless two dimensional scaling is required a better result may be obtained with an appropriate setting for `radius`.
    * @property {number} [rotation=0] Rotation in radians
    * (positive rotation clockwise, meaningful only when used in conjunction with a two dimensional scale).
    * @property {boolean} [rotateWithView=false] Whether to rotate the shape with the view
    * (meaningful only when used in conjunction with a two dimensional scale).
    * @property {"declutter"|"obstacle"|"none"|undefined} [declutterMode] Declutter mode
    */
  /**
    * @classdesc
    * Set circle style for vector features.
    * @api
    */
  @js.native
  trait CircleStyle
    extends typings.ol.styleRegularShapeMod.default {
    
    /**
      * Set the circle radius.
      *
      * @param {number} radius Circle radius.
      * @api
      */
    def setRadius(radius: Double): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Declutter mode
      */
    var declutterMode: js.UndefOr[declutter | obstacle | none] = js.undefined
    
    /**
      * displacement
      */
    var displacement: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Fill style.
      */
    var fill: js.UndefOr[typings.ol.styleFillMod.default] = js.undefined
    
    /**
      * Circle radius.
      */
    var radius: Double
    
    /**
      * Whether to rotate the shape with the view
      * (meaningful only when used in conjunction with a two dimensional scale).
      */
    var rotateWithView: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Rotation in radians
      * (positive rotation clockwise, meaningful only when used in conjunction with a two dimensional scale).
      */
    var rotation: js.UndefOr[Double] = js.undefined
    
    /**
      * Scale. A two dimensional scale will produce an ellipse.
      * Unless two dimensional scaling is required a better result may be obtained with an appropriate setting for `radius`.
      */
    var scale: js.UndefOr[Double | Size] = js.undefined
    
    /**
      * Stroke style.
      */
    var stroke: js.UndefOr[typings.ol.styleStrokeMod.default] = js.undefined
  }
  object Options {
    
    inline def apply(radius: Double): Options = {
      val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDeclutterMode(value: declutter | obstacle | none): Self = StObject.set(x, "declutterMode", value.asInstanceOf[js.Any])
      
      inline def setDeclutterModeUndefined: Self = StObject.set(x, "declutterMode", js.undefined)
      
      inline def setDisplacement(value: js.Array[Double]): Self = StObject.set(x, "displacement", value.asInstanceOf[js.Any])
      
      inline def setDisplacementUndefined: Self = StObject.set(x, "displacement", js.undefined)
      
      inline def setDisplacementVarargs(value: Double*): Self = StObject.set(x, "displacement", js.Array(value*))
      
      inline def setFill(value: typings.ol.styleFillMod.default): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
      
      inline def setRotateWithViewUndefined: Self = StObject.set(x, "rotateWithView", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScale(value: Double | Size): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScaleVarargs(value: Double*): Self = StObject.set(x, "scale", js.Array(value*))
      
      inline def setStroke(value: typings.ol.styleStrokeMod.default): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
}
