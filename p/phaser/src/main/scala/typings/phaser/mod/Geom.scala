package typings.phaser.mod

import typings.phaser.CenterFunction
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Math.Vector3
import typings.phaser.Phaser.Math.Vector4
import typings.phaser.Phaser.Types.Geom.Mesh.GenerateGridConfig
import typings.phaser.Phaser.Types.Geom.Mesh.GenerateGridVertsResult
import typings.phaser.Phaser.Types.Geom.Mesh.GenerateVertsResult
import typings.phaser.Phaser.Types.Geom.Mesh.OBJData
import typings.phaser.Phaser.Types.Math.Vector2Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Geom {
  
  @JSImport("phaser", "Geom")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A Circle Geometry object type.
    */
  @JSImport("phaser", "Geom.CIRCLE")
  @js.native
  def CIRCLE_ : Double = js.native
  
  inline def CIRCLE__=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CIRCLE")(x.asInstanceOf[js.Any])
  
  /**
    * A Circle object.
    * 
    * This is a geometry object, containing numerical values and related methods to inspect and modify them.
    * It is not a Game Object, in that you cannot add it to the display list, and it has no texture.
    * To render a Circle you should look at the capabilities of the Graphics class.
    */
  @JSImport("phaser", "Geom.Circle")
  @js.native
  /**
    * 
    * @param x The x position of the center of the circle. Default 0.
    * @param y The y position of the center of the circle. Default 0.
    * @param radius The radius of the circle. Default 0.
    */
  open class Circle ()
    extends StObject
       with typings.phaser.Phaser.Geom.Circle {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, radius: Double) = this()
    def this(x: Double, y: Unit, radius: Double) = this()
    def this(x: Unit, y: Double, radius: Double) = this()
    def this(x: Unit, y: Unit, radius: Double) = this()
  }
  object Circle {
    
    @JSImport("phaser", "Geom.Circle")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Calculates the area of the circle.
      * @param circle The Circle to get the area of.
      */
    /* static member */
    inline def Area(circle: typings.phaser.Phaser.Geom.Circle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Area")(circle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns the circumference of the given Circle.
      * @param circle The Circle to get the circumference of.
      */
    /* static member */
    inline def Circumference(circle: typings.phaser.Phaser.Geom.Circle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Circumference")(circle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Circle based on the given angle.
      * @param circle The Circle to get the circumference point on.
      * @param angle The angle from the center of the Circle to the circumference to return the point from. Given in radians.
      * @param out A Point, or point-like object, to store the results in. If not given a Point will be created.
      */
    /* static member */
    inline def CircumferencePoint[O /* <: typings.phaser.Phaser.Geom.Point */](circle: typings.phaser.Phaser.Geom.Circle, angle: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("CircumferencePoint")(circle.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def CircumferencePoint[O /* <: typings.phaser.Phaser.Geom.Point */](circle: typings.phaser.Phaser.Geom.Circle, angle: Double, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("CircumferencePoint")(circle.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    inline def Clone(source: js.Object): typings.phaser.Phaser.Geom.Circle = ^.asInstanceOf[js.Dynamic].applyDynamic("Clone")(source.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.Phaser.Geom.Circle]
    /**
      * Creates a new Circle instance based on the values contained in the given source.
      * @param source The Circle to be cloned. Can be an instance of a Circle or a circle-like object, with x, y and radius properties.
      */
    /* static member */
    inline def Clone(source: typings.phaser.Phaser.Geom.Circle): typings.phaser.Phaser.Geom.Circle = ^.asInstanceOf[js.Dynamic].applyDynamic("Clone")(source.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.Phaser.Geom.Circle]
    
    /**
      * Check to see if the Circle contains the given x / y coordinates.
      * @param circle The Circle to check.
      * @param x The x coordinate to check within the circle.
      * @param y The y coordinate to check within the circle.
      */
    /* static member */
    inline def Contains(circle: typings.phaser.Phaser.Geom.Circle, x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Contains")(circle.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def ContainsPoint(circle: typings.phaser.Phaser.Geom.Circle, point: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ContainsPoint")(circle.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    /**
      * Check to see if the Circle contains the given Point object.
      * @param circle The Circle to check.
      * @param point The Point object to check if it's within the Circle or not.
      */
    /* static member */
    inline def ContainsPoint(circle: typings.phaser.Phaser.Geom.Circle, point: typings.phaser.Phaser.Geom.Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ContainsPoint")(circle.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def ContainsRect(circle: typings.phaser.Phaser.Geom.Circle, rect: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ContainsRect")(circle.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    /**
      * Check to see if the Circle contains all four points of the given Rectangle object.
      * @param circle The Circle to check.
      * @param rect The Rectangle object to check if it's within the Circle or not.
      */
    /* static member */
    inline def ContainsRect(circle: typings.phaser.Phaser.Geom.Circle, rect: typings.phaser.Phaser.Geom.Rectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ContainsRect")(circle.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Copies the `x`, `y` and `radius` properties from the `source` Circle
      * into the given `dest` Circle, then returns the `dest` Circle.
      * @param source The source Circle to copy the values from.
      * @param dest The destination Circle to copy the values to.
      */
    /* static member */
    inline def CopyFrom[O /* <: typings.phaser.Phaser.Geom.Circle */](source: typings.phaser.Phaser.Geom.Circle, dest: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("CopyFrom")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Compares the `x`, `y` and `radius` properties of the two given Circles.
      * Returns `true` if they all match, otherwise returns `false`.
      * @param circle The first Circle to compare.
      * @param toCompare The second Circle to compare.
      */
    /* static member */
    inline def Equals(circle: typings.phaser.Phaser.Geom.Circle, toCompare: typings.phaser.Phaser.Geom.Circle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Equals")(circle.asInstanceOf[js.Any], toCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns the bounds of the Circle object.
      * @param circle The Circle to get the bounds from.
      * @param out A Rectangle, or rectangle-like object, to store the circle bounds in. If not given a new Rectangle will be created.
      */
    /* static member */
    inline def GetBounds[O /* <: typings.phaser.Phaser.Geom.Rectangle */](circle: typings.phaser.Phaser.Geom.Circle): O = ^.asInstanceOf[js.Dynamic].applyDynamic("GetBounds")(circle.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def GetBounds[O /* <: typings.phaser.Phaser.Geom.Rectangle */](circle: typings.phaser.Phaser.Geom.Circle, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetBounds")(circle.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Circle
      * based on the given angle normalized to the range 0 to 1. I.e. a value of 0.5 will give the point
      * at 180 degrees around the circle.
      * @param circle The Circle to get the circumference point on.
      * @param position A value between 0 and 1, where 0 equals 0 degrees, 0.5 equals 180 degrees and 1 equals 360 around the circle.
      * @param out An object to store the return values in. If not given a Point object will be created.
      */
    /* static member */
    inline def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](circle: typings.phaser.Phaser.Geom.Circle, position: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoint")(circle.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](circle: typings.phaser.Phaser.Geom.Circle, position: Double, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoint")(circle.asInstanceOf[js.Any], position.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Returns an array of Point objects containing the coordinates of the points around the circumference of the Circle,
      * based on the given quantity or stepRate values.
      * @param circle The Circle to get the points from.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the circumference of the circle and dividing it by the stepRate.
      * @param output An array to insert the points in to. If not provided a new array will be created.
      */
    /* static member */
    inline def GetPoints(circle: typings.phaser.Phaser.Geom.Circle, quantity: Double): js.Array[typings.phaser.Phaser.Geom.Point] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(circle.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Geom.Point]]
    inline def GetPoints(circle: typings.phaser.Phaser.Geom.Circle, quantity: Double, stepRate: Double): js.Array[typings.phaser.Phaser.Geom.Point] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(circle.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], stepRate.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Geom.Point]]
    inline def GetPoints(
      circle: typings.phaser.Phaser.Geom.Circle,
      quantity: Double,
      stepRate: Double,
      output: js.Array[Any]
    ): js.Array[typings.phaser.Phaser.Geom.Point] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(circle.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], stepRate.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Geom.Point]]
    inline def GetPoints(circle: typings.phaser.Phaser.Geom.Circle, quantity: Double, stepRate: Unit, output: js.Array[Any]): js.Array[typings.phaser.Phaser.Geom.Point] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(circle.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], stepRate.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Geom.Point]]
    
    /**
      * Offsets the Circle by the values given.
      * @param circle The Circle to be offset (translated.)
      * @param x The amount to horizontally offset the Circle by.
      * @param y The amount to vertically offset the Circle by.
      */
    /* static member */
    inline def Offset[O /* <: typings.phaser.Phaser.Geom.Circle */](circle: O, x: Double, y: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Offset")(circle.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[O]
    
    inline def OffsetPoint[O /* <: typings.phaser.Phaser.Geom.Circle */](circle: O, point: js.Object): O = (^.asInstanceOf[js.Dynamic].applyDynamic("OffsetPoint")(circle.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[O]
    /**
      * Offsets the Circle by the values given in the `x` and `y` properties of the Point object.
      * @param circle The Circle to be offset (translated.)
      * @param point The Point object containing the values to offset the Circle by.
      */
    /* static member */
    inline def OffsetPoint[O /* <: typings.phaser.Phaser.Geom.Circle */](circle: O, point: typings.phaser.Phaser.Geom.Point): O = (^.asInstanceOf[js.Dynamic].applyDynamic("OffsetPoint")(circle.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Returns a uniformly distributed random point from anywhere within the given Circle.
      * @param circle The Circle to get a random point from.
      * @param out A Point or point-like object to set the random `x` and `y` values in.
      */
    /* static member */
    inline def Random[O /* <: typings.phaser.Phaser.Geom.Point */](circle: typings.phaser.Phaser.Geom.Circle): O = ^.asInstanceOf[js.Dynamic].applyDynamic("Random")(circle.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def Random[O /* <: typings.phaser.Phaser.Geom.Point */](circle: typings.phaser.Phaser.Geom.Circle, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Random")(circle.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
  }
  
  /**
    * An Ellipse Geometry object type.
    */
  @JSImport("phaser", "Geom.ELLIPSE")
  @js.native
  def ELLIPSE_ : Double = js.native
  
  inline def ELLIPSE__=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ELLIPSE")(x.asInstanceOf[js.Any])
  
  /**
    * An Ellipse object.
    * 
    * This is a geometry object, containing numerical values and related methods to inspect and modify them.
    * It is not a Game Object, in that you cannot add it to the display list, and it has no texture.
    * To render an Ellipse you should look at the capabilities of the Graphics class.
    */
  @JSImport("phaser", "Geom.Ellipse")
  @js.native
  /**
    * 
    * @param x The x position of the center of the ellipse. Default 0.
    * @param y The y position of the center of the ellipse. Default 0.
    * @param width The width of the ellipse. Default 0.
    * @param height The height of the ellipse. Default 0.
    */
  open class Ellipse ()
    extends StObject
       with typings.phaser.Phaser.Geom.Ellipse {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, width: Double) = this()
    def this(x: Double, y: Unit, width: Double) = this()
    def this(x: Unit, y: Double, width: Double) = this()
    def this(x: Unit, y: Unit, width: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    def this(x: Double, y: Double, width: Unit, height: Double) = this()
    def this(x: Double, y: Unit, width: Double, height: Double) = this()
    def this(x: Double, y: Unit, width: Unit, height: Double) = this()
    def this(x: Unit, y: Double, width: Double, height: Double) = this()
    def this(x: Unit, y: Double, width: Unit, height: Double) = this()
    def this(x: Unit, y: Unit, width: Double, height: Double) = this()
    def this(x: Unit, y: Unit, width: Unit, height: Double) = this()
  }
  object Ellipse {
    
    @JSImport("phaser", "Geom.Ellipse")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Calculates the area of the Ellipse.
      * @param ellipse The Ellipse to get the area of.
      */
    /* static member */
    inline def Area(ellipse: typings.phaser.Phaser.Geom.Ellipse): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Area")(ellipse.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns the circumference of the given Ellipse.
      * @param ellipse The Ellipse to get the circumference of.
      */
    /* static member */
    inline def Circumference(ellipse: typings.phaser.Phaser.Geom.Ellipse): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Circumference")(ellipse.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Ellipse based on the given angle.
      * @param ellipse The Ellipse to get the circumference point on.
      * @param angle The angle from the center of the Ellipse to the circumference to return the point from. Given in radians.
      * @param out A Point, or point-like object, to store the results in. If not given a Point will be created.
      */
    /* static member */
    inline def CircumferencePoint[O /* <: typings.phaser.Phaser.Geom.Point */](ellipse: typings.phaser.Phaser.Geom.Ellipse, angle: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("CircumferencePoint")(ellipse.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def CircumferencePoint[O /* <: typings.phaser.Phaser.Geom.Point */](ellipse: typings.phaser.Phaser.Geom.Ellipse, angle: Double, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("CircumferencePoint")(ellipse.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Creates a new Ellipse instance based on the values contained in the given source.
      * @param source The Ellipse to be cloned. Can be an instance of an Ellipse or a ellipse-like object, with x, y, width and height properties.
      */
    /* static member */
    inline def Clone(source: typings.phaser.Phaser.Geom.Ellipse): typings.phaser.Phaser.Geom.Ellipse = ^.asInstanceOf[js.Dynamic].applyDynamic("Clone")(source.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.Phaser.Geom.Ellipse]
    
    /**
      * Check to see if the Ellipse contains the given x / y coordinates.
      * @param ellipse The Ellipse to check.
      * @param x The x coordinate to check within the ellipse.
      * @param y The y coordinate to check within the ellipse.
      */
    /* static member */
    inline def Contains(ellipse: typings.phaser.Phaser.Geom.Ellipse, x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Contains")(ellipse.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def ContainsPoint(ellipse: typings.phaser.Phaser.Geom.Ellipse, point: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ContainsPoint")(ellipse.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    /**
      * Check to see if the Ellipse contains the given Point object.
      * @param ellipse The Ellipse to check.
      * @param point The Point object to check if it's within the Circle or not.
      */
    /* static member */
    inline def ContainsPoint(ellipse: typings.phaser.Phaser.Geom.Ellipse, point: typings.phaser.Phaser.Geom.Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ContainsPoint")(ellipse.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def ContainsRect(ellipse: typings.phaser.Phaser.Geom.Ellipse, rect: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ContainsRect")(ellipse.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    /**
      * Check to see if the Ellipse contains all four points of the given Rectangle object.
      * @param ellipse The Ellipse to check.
      * @param rect The Rectangle object to check if it's within the Ellipse or not.
      */
    /* static member */
    inline def ContainsRect(ellipse: typings.phaser.Phaser.Geom.Ellipse, rect: typings.phaser.Phaser.Geom.Rectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ContainsRect")(ellipse.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Copies the `x`, `y`, `width` and `height` properties from the `source` Ellipse
      * into the given `dest` Ellipse, then returns the `dest` Ellipse.
      * @param source The source Ellipse to copy the values from.
      * @param dest The destination Ellipse to copy the values to.
      */
    /* static member */
    inline def CopyFrom[O /* <: typings.phaser.Phaser.Geom.Ellipse */](source: typings.phaser.Phaser.Geom.Ellipse, dest: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("CopyFrom")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Compares the `x`, `y`, `width` and `height` properties of the two given Ellipses.
      * Returns `true` if they all match, otherwise returns `false`.
      * @param ellipse The first Ellipse to compare.
      * @param toCompare The second Ellipse to compare.
      */
    /* static member */
    inline def Equals(ellipse: typings.phaser.Phaser.Geom.Ellipse, toCompare: typings.phaser.Phaser.Geom.Ellipse): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Equals")(ellipse.asInstanceOf[js.Any], toCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns the bounds of the Ellipse object.
      * @param ellipse The Ellipse to get the bounds from.
      * @param out A Rectangle, or rectangle-like object, to store the ellipse bounds in. If not given a new Rectangle will be created.
      */
    /* static member */
    inline def GetBounds[O /* <: typings.phaser.Phaser.Geom.Rectangle */](ellipse: typings.phaser.Phaser.Geom.Ellipse): O = ^.asInstanceOf[js.Dynamic].applyDynamic("GetBounds")(ellipse.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def GetBounds[O /* <: typings.phaser.Phaser.Geom.Rectangle */](ellipse: typings.phaser.Phaser.Geom.Ellipse, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetBounds")(ellipse.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Ellipse
      * based on the given angle normalized to the range 0 to 1. I.e. a value of 0.5 will give the point
      * at 180 degrees around the circle.
      * @param ellipse The Ellipse to get the circumference point on.
      * @param position A value between 0 and 1, where 0 equals 0 degrees, 0.5 equals 180 degrees and 1 equals 360 around the ellipse.
      * @param out An object to store the return values in. If not given a Point object will be created.
      */
    /* static member */
    inline def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](ellipse: typings.phaser.Phaser.Geom.Ellipse, position: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoint")(ellipse.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](ellipse: typings.phaser.Phaser.Geom.Ellipse, position: Double, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoint")(ellipse.asInstanceOf[js.Any], position.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Returns an array of Point objects containing the coordinates of the points around the circumference of the Ellipse,
      * based on the given quantity or stepRate values.
      * @param ellipse The Ellipse to get the points from.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the circumference of the ellipse and dividing it by the stepRate.
      * @param out An array to insert the points in to. If not provided a new array will be created.
      */
    /* static member */
    inline def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](ellipse: typings.phaser.Phaser.Geom.Ellipse, quantity: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(ellipse.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](ellipse: typings.phaser.Phaser.Geom.Ellipse, quantity: Double, stepRate: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(ellipse.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], stepRate.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](ellipse: typings.phaser.Phaser.Geom.Ellipse, quantity: Double, stepRate: Double, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(ellipse.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], stepRate.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](ellipse: typings.phaser.Phaser.Geom.Ellipse, quantity: Double, stepRate: Unit, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(ellipse.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], stepRate.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Offsets the Ellipse by the values given.
      * @param ellipse The Ellipse to be offset (translated.)
      * @param x The amount to horizontally offset the Ellipse by.
      * @param y The amount to vertically offset the Ellipse by.
      */
    /* static member */
    inline def Offset[O /* <: typings.phaser.Phaser.Geom.Ellipse */](ellipse: O, x: Double, y: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Offset")(ellipse.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[O]
    
    inline def OffsetPoint[O /* <: typings.phaser.Phaser.Geom.Ellipse */](ellipse: O, point: js.Object): O = (^.asInstanceOf[js.Dynamic].applyDynamic("OffsetPoint")(ellipse.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[O]
    /**
      * Offsets the Ellipse by the values given in the `x` and `y` properties of the Point object.
      * @param ellipse The Ellipse to be offset (translated.)
      * @param point The Point object containing the values to offset the Ellipse by.
      */
    /* static member */
    inline def OffsetPoint[O /* <: typings.phaser.Phaser.Geom.Ellipse */](ellipse: O, point: typings.phaser.Phaser.Geom.Point): O = (^.asInstanceOf[js.Dynamic].applyDynamic("OffsetPoint")(ellipse.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Returns a uniformly distributed random point from anywhere within the given Ellipse.
      * @param ellipse The Ellipse to get a random point from.
      * @param out A Point or point-like object to set the random `x` and `y` values in.
      */
    /* static member */
    inline def Random[O /* <: typings.phaser.Phaser.Geom.Point */](ellipse: typings.phaser.Phaser.Geom.Ellipse): O = ^.asInstanceOf[js.Dynamic].applyDynamic("Random")(ellipse.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def Random[O /* <: typings.phaser.Phaser.Geom.Point */](ellipse: typings.phaser.Phaser.Geom.Ellipse, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Random")(ellipse.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
  }
  
  object Intersects {
    
    @JSImport("phaser", "Geom.Intersects")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Checks if two Circles intersect.
      * @param circleA The first Circle to check for intersection.
      * @param circleB The second Circle to check for intersection.
      */
    inline def CircleToCircle(circleA: typings.phaser.Phaser.Geom.Circle, circleB: typings.phaser.Phaser.Geom.Circle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("CircleToCircle")(circleA.asInstanceOf[js.Any], circleB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Checks for intersection between a circle and a rectangle.
      * @param circle The circle to be checked.
      * @param rect The rectangle to be checked.
      */
    inline def CircleToRectangle(circle: typings.phaser.Phaser.Geom.Circle, rect: typings.phaser.Phaser.Geom.Rectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("CircleToRectangle")(circle.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Checks if two Circles intersect and returns the intersection points as a Point object array.
      * @param circleA The first Circle to check for intersection.
      * @param circleB The second Circle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    inline def GetCircleToCircle(circleA: typings.phaser.Phaser.Geom.Circle, circleB: typings.phaser.Phaser.Geom.Circle): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCircleToCircle")(circleA.asInstanceOf[js.Any], circleB.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetCircleToCircle(
      circleA: typings.phaser.Phaser.Geom.Circle,
      circleB: typings.phaser.Phaser.Geom.Circle,
      out: js.Array[Any]
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCircleToCircle")(circleA.asInstanceOf[js.Any], circleB.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Checks for intersection between a circle and a rectangle,
      * and returns the intersection points as a Point object array.
      * @param circle The circle to be checked.
      * @param rect The rectangle to be checked.
      * @param out An optional array in which to store the points of intersection.
      */
    inline def GetCircleToRectangle(circle: typings.phaser.Phaser.Geom.Circle, rect: typings.phaser.Phaser.Geom.Rectangle): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCircleToRectangle")(circle.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetCircleToRectangle(
      circle: typings.phaser.Phaser.Geom.Circle,
      rect: typings.phaser.Phaser.Geom.Rectangle,
      out: js.Array[Any]
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCircleToRectangle")(circle.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Checks for intersection between the line segment and circle,
      * and returns the intersection points as a Point object array.
      * @param line The line segment to check.
      * @param circle The circle to check against the line.
      * @param out An optional array in which to store the points of intersection.
      */
    inline def GetLineToCircle(line: typings.phaser.Phaser.Geom.Line, circle: typings.phaser.Phaser.Geom.Circle): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetLineToCircle")(line.asInstanceOf[js.Any], circle.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetLineToCircle(
      line: typings.phaser.Phaser.Geom.Line,
      circle: typings.phaser.Phaser.Geom.Circle,
      out: js.Array[Any]
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetLineToCircle")(line.asInstanceOf[js.Any], circle.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Checks for intersection between the two line segments and returns the intersection point as a Vector3,
      * or `null` if the lines are parallel, or do not intersect.
      * 
      * The `z` property of the Vector3 contains the intersection distance, which can be used to find
      * the closest intersecting point from a group of line segments.
      * @param line1 The first line segment to check.
      * @param line2 The second line segment to check.
      * @param out A Vector3 to store the intersection results in.
      */
    inline def GetLineToLine(line1: typings.phaser.Phaser.Geom.Line, line2: typings.phaser.Phaser.Geom.Line): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("GetLineToLine")(line1.asInstanceOf[js.Any], line2.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    inline def GetLineToLine(line1: typings.phaser.Phaser.Geom.Line, line2: typings.phaser.Phaser.Geom.Line, out: Vector3): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("GetLineToLine")(line1.asInstanceOf[js.Any], line2.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    /**
      * Checks for the closest point of intersection between a line segment and an array of points, where each pair
      * of points are converted to line segments for the intersection tests.
      * 
      * If no intersection is found, this function returns `null`.
      * 
      * If intersection was found, a Vector3 is returned with the following properties:
      * 
      * The `x` and `y` components contain the point of the intersection.
      * The `z` component contains the closest distance.
      * @param line The line segment to check.
      * @param points An array of points to check.
      * @param out A Vector3 to store the intersection results in.
      */
    inline def GetLineToPoints(
      line: typings.phaser.Phaser.Geom.Line,
      points: js.Array[typings.phaser.Phaser.Geom.Point | Vector2]
    ): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("GetLineToPoints")(line.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    inline def GetLineToPoints(
      line: typings.phaser.Phaser.Geom.Line,
      points: js.Array[typings.phaser.Phaser.Geom.Point | Vector2],
      out: Vector3
    ): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("GetLineToPoints")(line.asInstanceOf[js.Any], points.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    inline def GetLineToPolygon(line: typings.phaser.Phaser.Geom.Line, polygons: js.Array[typings.phaser.Phaser.Geom.Polygon]): Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("GetLineToPolygon")(line.asInstanceOf[js.Any], polygons.asInstanceOf[js.Any])).asInstanceOf[Vector4]
    inline def GetLineToPolygon(
      line: typings.phaser.Phaser.Geom.Line,
      polygons: js.Array[typings.phaser.Phaser.Geom.Polygon],
      out: Vector4
    ): Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("GetLineToPolygon")(line.asInstanceOf[js.Any], polygons.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Vector4]
    /**
      * Checks for the closest point of intersection between a line segment and an array of polygons.
      * 
      * If no intersection is found, this function returns `null`.
      * 
      * If intersection was found, a Vector4 is returned with the following properties:
      * 
      * The `x` and `y` components contain the point of the intersection.
      * The `z` component contains the closest distance.
      * The `w` component contains the index of the polygon, in the given array, that triggered the intersection.
      * @param line The line segment to check.
      * @param polygons A single polygon, or array of polygons, to check.
      * @param out A Vector4 to store the intersection results in.
      */
    inline def GetLineToPolygon(line: typings.phaser.Phaser.Geom.Line, polygons: typings.phaser.Phaser.Geom.Polygon): Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("GetLineToPolygon")(line.asInstanceOf[js.Any], polygons.asInstanceOf[js.Any])).asInstanceOf[Vector4]
    inline def GetLineToPolygon(line: typings.phaser.Phaser.Geom.Line, polygons: typings.phaser.Phaser.Geom.Polygon, out: Vector4): Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("GetLineToPolygon")(line.asInstanceOf[js.Any], polygons.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Vector4]
    
    inline def GetLineToRectangle(line: typings.phaser.Phaser.Geom.Line, rect: js.Object): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetLineToRectangle")(line.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetLineToRectangle(line: typings.phaser.Phaser.Geom.Line, rect: js.Object, out: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetLineToRectangle")(line.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    /**
      * Checks for intersection between the Line and a Rectangle shape,
      * and returns the intersection points as a Point object array.
      * @param line The Line to check for intersection.
      * @param rect The Rectangle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    inline def GetLineToRectangle(line: typings.phaser.Phaser.Geom.Line, rect: typings.phaser.Phaser.Geom.Rectangle): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetLineToRectangle")(line.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetLineToRectangle(
      line: typings.phaser.Phaser.Geom.Line,
      rect: typings.phaser.Phaser.Geom.Rectangle,
      out: js.Array[Any]
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetLineToRectangle")(line.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def GetRaysFromPointToPolygon(x: Double, y: Double, polygons: js.Array[typings.phaser.Phaser.Geom.Polygon]): js.Array[Vector4] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetRaysFromPointToPolygon")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], polygons.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector4]]
    /**
      * Projects rays out from the given point to each line segment of the polygons.
      * 
      * If the rays intersect with the polygons, the points of intersection are returned in an array.
      * 
      * If no intersections are found, the returned array will be empty.
      * 
      * Each Vector4 intersection result has the following properties:
      * 
      * The `x` and `y` components contain the point of the intersection.
      * The `z` component contains the angle of intersection.
      * The `w` component contains the index of the polygon, in the given array, that triggered the intersection.
      * @param x The x coordinate to project the rays from.
      * @param y The y coordinate to project the rays from.
      * @param polygons A single polygon, or array of polygons, to check against the rays.
      */
    inline def GetRaysFromPointToPolygon(x: Double, y: Double, polygons: typings.phaser.Phaser.Geom.Polygon): js.Array[Vector4] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetRaysFromPointToPolygon")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], polygons.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector4]]
    
    /**
      * Checks if two Rectangle shapes intersect and returns the area of this intersection as Rectangle object.
      * 
      * If optional `output` parameter is omitted, new Rectangle object is created and returned. If there is intersection, it will contain intersection area. If there is no intersection, it wil be empty Rectangle (all values set to zero).
      * 
      * If Rectangle object is passed as `output` and there is intersection, then intersection area data will be loaded into it and it will be returned. If there is no intersection, it will be returned without any change.
      * @param rectA The first Rectangle object.
      * @param rectB The second Rectangle object.
      * @param output Optional Rectangle object. If given, the intersection data will be loaded into it (in case of no intersection, it will be left unchanged). Otherwise, new Rectangle object will be created and returned with either intersection data or empty (all values set to zero), if there is no intersection.
      */
    inline def GetRectangleIntersection[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rectA: typings.phaser.Phaser.Geom.Rectangle, rectB: typings.phaser.Phaser.Geom.Rectangle): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetRectangleIntersection")(rectA.asInstanceOf[js.Any], rectB.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetRectangleIntersection[O /* <: typings.phaser.Phaser.Geom.Rectangle */](
      rectA: typings.phaser.Phaser.Geom.Rectangle,
      rectB: typings.phaser.Phaser.Geom.Rectangle,
      output: O
    ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetRectangleIntersection")(rectA.asInstanceOf[js.Any], rectB.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Checks if two Rectangles intersect and returns the intersection points as a Point object array.
      * 
      * A Rectangle intersects another Rectangle if any part of its bounds is within the other Rectangle's bounds. As such, the two Rectangles are considered "solid". A Rectangle with no width or no height will never intersect another Rectangle.
      * @param rectA The first Rectangle to check for intersection.
      * @param rectB The second Rectangle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    inline def GetRectangleToRectangle(rectA: typings.phaser.Phaser.Geom.Rectangle, rectB: typings.phaser.Phaser.Geom.Rectangle): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetRectangleToRectangle")(rectA.asInstanceOf[js.Any], rectB.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetRectangleToRectangle(
      rectA: typings.phaser.Phaser.Geom.Rectangle,
      rectB: typings.phaser.Phaser.Geom.Rectangle,
      out: js.Array[Any]
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetRectangleToRectangle")(rectA.asInstanceOf[js.Any], rectB.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Checks for intersection between Rectangle shape and Triangle shape,
      * and returns the intersection points as a Point object array.
      * @param rect Rectangle object to test.
      * @param triangle Triangle object to test.
      * @param out An optional array in which to store the points of intersection.
      */
    inline def GetRectangleToTriangle(rect: typings.phaser.Phaser.Geom.Rectangle, triangle: typings.phaser.Phaser.Geom.Triangle): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetRectangleToTriangle")(rect.asInstanceOf[js.Any], triangle.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetRectangleToTriangle(
      rect: typings.phaser.Phaser.Geom.Rectangle,
      triangle: typings.phaser.Phaser.Geom.Triangle,
      out: js.Array[Any]
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetRectangleToTriangle")(rect.asInstanceOf[js.Any], triangle.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Checks if a Triangle and a Circle intersect, and returns the intersection points as a Point object array.
      * 
      * A Circle intersects a Triangle if its center is located within it or if any of the Triangle's sides intersect the Circle. As such, the Triangle and the Circle are considered "solid" for the intersection.
      * @param triangle The Triangle to check for intersection.
      * @param circle The Circle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    inline def GetTriangleToCircle(triangle: typings.phaser.Phaser.Geom.Triangle, circle: typings.phaser.Phaser.Geom.Circle): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetTriangleToCircle")(triangle.asInstanceOf[js.Any], circle.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetTriangleToCircle(
      triangle: typings.phaser.Phaser.Geom.Triangle,
      circle: typings.phaser.Phaser.Geom.Circle,
      out: js.Array[Any]
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetTriangleToCircle")(triangle.asInstanceOf[js.Any], circle.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Checks if a Triangle and a Line intersect, and returns the intersection points as a Point object array.
      * 
      * The Line intersects the Triangle if it starts inside of it, ends inside of it, or crosses any of the Triangle's sides. Thus, the Triangle is considered "solid".
      * @param triangle The Triangle to check with.
      * @param line The Line to check with.
      * @param out An optional array in which to store the points of intersection.
      */
    inline def GetTriangleToLine(triangle: typings.phaser.Phaser.Geom.Triangle, line: typings.phaser.Phaser.Geom.Line): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetTriangleToLine")(triangle.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetTriangleToLine(
      triangle: typings.phaser.Phaser.Geom.Triangle,
      line: typings.phaser.Phaser.Geom.Line,
      out: js.Array[Any]
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetTriangleToLine")(triangle.asInstanceOf[js.Any], line.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Checks if two Triangles intersect, and returns the intersection points as a Point object array.
      * 
      * A Triangle intersects another Triangle if any pair of their lines intersects or if any point of one Triangle is within the other Triangle. Thus, the Triangles are considered "solid".
      * @param triangleA The first Triangle to check for intersection.
      * @param triangleB The second Triangle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    inline def GetTriangleToTriangle(triangleA: typings.phaser.Phaser.Geom.Triangle, triangleB: typings.phaser.Phaser.Geom.Triangle): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetTriangleToTriangle")(triangleA.asInstanceOf[js.Any], triangleB.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def GetTriangleToTriangle(
      triangleA: typings.phaser.Phaser.Geom.Triangle,
      triangleB: typings.phaser.Phaser.Geom.Triangle,
      out: js.Array[Any]
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetTriangleToTriangle")(triangleA.asInstanceOf[js.Any], triangleB.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Checks for intersection between the line segment and circle.
      * 
      * Based on code by [Matt DesLauriers](https://github.com/mattdesl/line-circle-collision/blob/master/LICENSE.md).
      * @param line The line segment to check.
      * @param circle The circle to check against the line.
      * @param nearest An optional Point-like object. If given the closest point on the Line where the circle intersects will be stored in this object.
      */
    inline def LineToCircle(line: typings.phaser.Phaser.Geom.Line, circle: typings.phaser.Phaser.Geom.Circle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("LineToCircle")(line.asInstanceOf[js.Any], circle.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def LineToCircle(line: typings.phaser.Phaser.Geom.Line, circle: typings.phaser.Phaser.Geom.Circle, nearest: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("LineToCircle")(line.asInstanceOf[js.Any], circle.asInstanceOf[js.Any], nearest.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def LineToCircle(
      line: typings.phaser.Phaser.Geom.Line,
      circle: typings.phaser.Phaser.Geom.Circle,
      nearest: typings.phaser.Phaser.Geom.Point
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("LineToCircle")(line.asInstanceOf[js.Any], circle.asInstanceOf[js.Any], nearest.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Checks if two Lines intersect. If the Lines are identical, they will be treated as parallel and thus non-intersecting.
      * @param line1 The first Line to check.
      * @param line2 The second Line to check.
      * @param out A Point in which to optionally store the point of intersection.
      */
    inline def LineToLine(line1: typings.phaser.Phaser.Geom.Line, line2: typings.phaser.Phaser.Geom.Line): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("LineToLine")(line1.asInstanceOf[js.Any], line2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def LineToLine(
      line1: typings.phaser.Phaser.Geom.Line,
      line2: typings.phaser.Phaser.Geom.Line,
      out: typings.phaser.Phaser.Geom.Point
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("LineToLine")(line1.asInstanceOf[js.Any], line2.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def LineToRectangle(line: typings.phaser.Phaser.Geom.Line, rect: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("LineToRectangle")(line.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    /**
      * Checks for intersection between the Line and a Rectangle shape, or a rectangle-like
      * object, with public `x`, `y`, `right` and `bottom` properties, such as a Sprite or Body.
      * 
      * An intersection is considered valid if:
      * 
      * The line starts within, or ends within, the Rectangle.
      * The line segment intersects one of the 4 rectangle edges.
      * 
      * The for the purposes of this function rectangles are considered 'solid'.
      * @param line The Line to check for intersection.
      * @param rect The Rectangle to check for intersection.
      */
    inline def LineToRectangle(line: typings.phaser.Phaser.Geom.Line, rect: typings.phaser.Phaser.Geom.Rectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("LineToRectangle")(line.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def PointToLine(point: Any, line: typings.phaser.Phaser.Geom.Line): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PointToLine")(point.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def PointToLine(point: Any, line: typings.phaser.Phaser.Geom.Line, lineThickness: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PointToLine")(point.asInstanceOf[js.Any], line.asInstanceOf[js.Any], lineThickness.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    /**
      * Checks if the a Point falls between the two end-points of a Line, based on the given line thickness.
      * 
      * Assumes that the line end points are circular, not square.
      * @param point The point, or point-like object to check.
      * @param line The line segment to test for intersection on.
      * @param lineThickness The line thickness. Assumes that the line end points are circular. Default 1.
      */
    inline def PointToLine(point: typings.phaser.Phaser.Geom.Point, line: typings.phaser.Phaser.Geom.Line): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PointToLine")(point.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def PointToLine(
      point: typings.phaser.Phaser.Geom.Point,
      line: typings.phaser.Phaser.Geom.Line,
      lineThickness: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PointToLine")(point.asInstanceOf[js.Any], line.asInstanceOf[js.Any], lineThickness.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Checks if a Point is located on the given line segment.
      * @param point The Point to check for intersection.
      * @param line The line segment to check for intersection.
      */
    inline def PointToLineSegment(point: typings.phaser.Phaser.Geom.Point, line: typings.phaser.Phaser.Geom.Line): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PointToLineSegment")(point.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Checks if two Rectangles intersect.
      * 
      * A Rectangle intersects another Rectangle if any part of its bounds is within the other Rectangle's bounds.
      * As such, the two Rectangles are considered "solid".
      * A Rectangle with no width or no height will never intersect another Rectangle.
      * @param rectA The first Rectangle to check for intersection.
      * @param rectB The second Rectangle to check for intersection.
      */
    inline def RectangleToRectangle(rectA: typings.phaser.Phaser.Geom.Rectangle, rectB: typings.phaser.Phaser.Geom.Rectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("RectangleToRectangle")(rectA.asInstanceOf[js.Any], rectB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Checks for intersection between Rectangle shape and Triangle shape.
      * @param rect Rectangle object to test.
      * @param triangle Triangle object to test.
      */
    inline def RectangleToTriangle(rect: typings.phaser.Phaser.Geom.Rectangle, triangle: typings.phaser.Phaser.Geom.Triangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("RectangleToTriangle")(rect.asInstanceOf[js.Any], triangle.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Check if rectangle intersects with values.
      * @param rect The rectangle object
      * @param left The x coordinate of the left of the Rectangle.
      * @param right The x coordinate of the right of the Rectangle.
      * @param top The y coordinate of the top of the Rectangle.
      * @param bottom The y coordinate of the bottom of the Rectangle.
      * @param tolerance Tolerance allowed in the calculation, expressed in pixels. Default 0.
      */
    inline def RectangleToValues(
      rect: typings.phaser.Phaser.Geom.Rectangle,
      left: Double,
      right: Double,
      top: Double,
      bottom: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("RectangleToValues")(rect.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], top.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def RectangleToValues(
      rect: typings.phaser.Phaser.Geom.Rectangle,
      left: Double,
      right: Double,
      top: Double,
      bottom: Double,
      tolerance: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("RectangleToValues")(rect.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], top.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Checks if a Triangle and a Circle intersect.
      * 
      * A Circle intersects a Triangle if its center is located within it or if any of the Triangle's sides intersect the Circle. As such, the Triangle and the Circle are considered "solid" for the intersection.
      * @param triangle The Triangle to check for intersection.
      * @param circle The Circle to check for intersection.
      */
    inline def TriangleToCircle(triangle: typings.phaser.Phaser.Geom.Triangle, circle: typings.phaser.Phaser.Geom.Circle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("TriangleToCircle")(triangle.asInstanceOf[js.Any], circle.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Checks if a Triangle and a Line intersect.
      * 
      * The Line intersects the Triangle if it starts inside of it, ends inside of it, or crosses any of the Triangle's sides. Thus, the Triangle is considered "solid".
      * @param triangle The Triangle to check with.
      * @param line The Line to check with.
      */
    inline def TriangleToLine(triangle: typings.phaser.Phaser.Geom.Triangle, line: typings.phaser.Phaser.Geom.Line): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("TriangleToLine")(triangle.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Checks if two Triangles intersect.
      * 
      * A Triangle intersects another Triangle if any pair of their lines intersects or if any point of one Triangle is within the other Triangle. Thus, the Triangles are considered "solid".
      * @param triangleA The first Triangle to check for intersection.
      * @param triangleB The second Triangle to check for intersection.
      */
    inline def TriangleToTriangle(triangleA: typings.phaser.Phaser.Geom.Triangle, triangleB: typings.phaser.Phaser.Geom.Triangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("TriangleToTriangle")(triangleA.asInstanceOf[js.Any], triangleB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  /**
    * A Line Geometry object type.
    */
  @JSImport("phaser", "Geom.LINE")
  @js.native
  def LINE_ : Double = js.native
  
  inline def LINE__=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINE")(x.asInstanceOf[js.Any])
  
  /**
    * Defines a Line segment, a part of a line between two endpoints.
    */
  @JSImport("phaser", "Geom.Line")
  @js.native
  /**
    * 
    * @param x1 The x coordinate of the lines starting point. Default 0.
    * @param y1 The y coordinate of the lines starting point. Default 0.
    * @param x2 The x coordinate of the lines ending point. Default 0.
    * @param y2 The y coordinate of the lines ending point. Default 0.
    */
  open class Line ()
    extends StObject
       with typings.phaser.Phaser.Geom.Line {
    def this(x1: Double) = this()
    def this(x1: Double, y1: Double) = this()
    def this(x1: Unit, y1: Double) = this()
    def this(x1: Double, y1: Double, x2: Double) = this()
    def this(x1: Double, y1: Unit, x2: Double) = this()
    def this(x1: Unit, y1: Double, x2: Double) = this()
    def this(x1: Unit, y1: Unit, x2: Double) = this()
    def this(x1: Double, y1: Double, x2: Double, y2: Double) = this()
    def this(x1: Double, y1: Double, x2: Unit, y2: Double) = this()
    def this(x1: Double, y1: Unit, x2: Double, y2: Double) = this()
    def this(x1: Double, y1: Unit, x2: Unit, y2: Double) = this()
    def this(x1: Unit, y1: Double, x2: Double, y2: Double) = this()
    def this(x1: Unit, y1: Double, x2: Unit, y2: Double) = this()
    def this(x1: Unit, y1: Unit, x2: Double, y2: Double) = this()
    def this(x1: Unit, y1: Unit, x2: Unit, y2: Double) = this()
  }
  object Line {
    
    @JSImport("phaser", "Geom.Line")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Calculate the angle of the line in radians.
      * @param line The line to calculate the angle of.
      */
    /* static member */
    inline def Angle(line: typings.phaser.Phaser.Geom.Line): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Angle")(line.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Using Bresenham's line algorithm this will return an array of all coordinates on this line.
      * 
      * The `start` and `end` points are rounded before this runs as the algorithm works on integers.
      * @param line The line.
      * @param stepRate The optional step rate for the points on the line. Default 1.
      * @param results An optional array to push the resulting coordinates into.
      */
    /* static member */
    inline def BresenhamPoints(line: typings.phaser.Phaser.Geom.Line): js.Array[Vector2Like] = ^.asInstanceOf[js.Dynamic].applyDynamic("BresenhamPoints")(line.asInstanceOf[js.Any]).asInstanceOf[js.Array[Vector2Like]]
    inline def BresenhamPoints(line: typings.phaser.Phaser.Geom.Line, stepRate: Double): js.Array[Vector2Like] = (^.asInstanceOf[js.Dynamic].applyDynamic("BresenhamPoints")(line.asInstanceOf[js.Any], stepRate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector2Like]]
    inline def BresenhamPoints(line: typings.phaser.Phaser.Geom.Line, stepRate: Double, results: js.Array[Vector2Like]): js.Array[Vector2Like] = (^.asInstanceOf[js.Dynamic].applyDynamic("BresenhamPoints")(line.asInstanceOf[js.Any], stepRate.asInstanceOf[js.Any], results.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector2Like]]
    inline def BresenhamPoints(line: typings.phaser.Phaser.Geom.Line, stepRate: Unit, results: js.Array[Vector2Like]): js.Array[Vector2Like] = (^.asInstanceOf[js.Dynamic].applyDynamic("BresenhamPoints")(line.asInstanceOf[js.Any], stepRate.asInstanceOf[js.Any], results.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector2Like]]
    
    /**
      * Center a line on the given coordinates.
      * @param line The line to center.
      * @param x The horizontal coordinate to center the line on.
      * @param y The vertical coordinate to center the line on.
      */
    /* static member */
    inline def CenterOn(line: typings.phaser.Phaser.Geom.Line, x: Double, y: Double): typings.phaser.Phaser.Geom.Line = (^.asInstanceOf[js.Dynamic].applyDynamic("CenterOn")(line.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Geom.Line]
    
    /**
      * Clone the given line.
      * @param source The source line to clone.
      */
    /* static member */
    inline def Clone(source: typings.phaser.Phaser.Geom.Line): typings.phaser.Phaser.Geom.Line = ^.asInstanceOf[js.Dynamic].applyDynamic("Clone")(source.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.Phaser.Geom.Line]
    
    /**
      * Copy the values of one line to a destination line.
      * @param source The source line to copy the values from.
      * @param dest The destination line to copy the values to.
      */
    /* static member */
    inline def CopyFrom[O /* <: typings.phaser.Phaser.Geom.Line */](source: typings.phaser.Phaser.Geom.Line, dest: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("CopyFrom")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Compare two lines for strict equality.
      * @param line The first line to compare.
      * @param toCompare The second line to compare.
      */
    /* static member */
    inline def Equals(line: typings.phaser.Phaser.Geom.Line, toCompare: typings.phaser.Phaser.Geom.Line): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Equals")(line.asInstanceOf[js.Any], toCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Extends the start and end points of a Line by the given amounts.
      * 
      * The amounts can be positive or negative. Positive points will increase the length of the line,
      * while negative ones will decrease it.
      * 
      * If no `right` value is provided it will extend the length of the line equally in both directions.
      * 
      * Pass a value of zero to leave the start or end point unchanged.
      * @param line The line instance to extend.
      * @param left The amount to extend the start of the line by.
      * @param right The amount to extend the end of the line by. If not given it will be set to the `left` value.
      */
    /* static member */
    inline def Extend(line: typings.phaser.Phaser.Geom.Line, left: Double): typings.phaser.Phaser.Geom.Line = (^.asInstanceOf[js.Dynamic].applyDynamic("Extend")(line.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Geom.Line]
    inline def Extend(line: typings.phaser.Phaser.Geom.Line, left: Double, right: Double): typings.phaser.Phaser.Geom.Line = (^.asInstanceOf[js.Dynamic].applyDynamic("Extend")(line.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Geom.Line]
    
    /**
      * Returns an array of `quantity` Points where each point is taken from the given Line,
      * spaced out according to the ease function specified.
      * 
      * ```javascript
      * const line = new Phaser.Geom.Line(100, 300, 700, 300);
      * const points = Phaser.Geom.Line.GetEasedPoints(line, 'sine.out', 32)
      * ```
      * 
      * In the above example, the `points` array will contain 32 points spread-out across
      * the length of `line`, where the position of each point is determined by the `Sine.out`
      * ease function.
      * 
      * You can optionally provide a collinear threshold. In this case, the resulting points
      * are checked against each other, and if they are `< collinearThreshold` distance apart,
      * they are dropped from the results. This can help avoid lots of clustered points at
      * far ends of the line with tightly-packed eases such as Quartic. Leave the value set
      * to zero to skip this check.
      * 
      * Note that if you provide a collinear threshold, the resulting array may not always
      * contain `quantity` points.
      * @param line The Line object.
      * @param ease The ease to use. This can be either a string from the EaseMap, or a custom function.
      * @param quantity The number of points to return. Note that if you provide a `collinearThreshold`, the resulting array may not always contain this number of points.
      * @param collinearThreshold An optional threshold. The final array is reduced so that each point is spaced out at least this distance apart. This helps reduce clustering in noisey eases. Default 0.
      * @param easeParams An optional array of ease parameters to go with the ease.
      */
    /* static member */
    inline def GetEasedPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](line: typings.phaser.Phaser.Geom.Line, ease: String, quantity: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetEasedPoints")(line.asInstanceOf[js.Any], ease.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetEasedPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](line: typings.phaser.Phaser.Geom.Line, ease: String, quantity: Double, collinearThreshold: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetEasedPoints")(line.asInstanceOf[js.Any], ease.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], collinearThreshold.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetEasedPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](
      line: typings.phaser.Phaser.Geom.Line,
      ease: String,
      quantity: Double,
      collinearThreshold: Double,
      easeParams: js.Array[Double]
    ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetEasedPoints")(line.asInstanceOf[js.Any], ease.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], collinearThreshold.asInstanceOf[js.Any], easeParams.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetEasedPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](
      line: typings.phaser.Phaser.Geom.Line,
      ease: String,
      quantity: Double,
      collinearThreshold: Unit,
      easeParams: js.Array[Double]
    ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetEasedPoints")(line.asInstanceOf[js.Any], ease.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], collinearThreshold.asInstanceOf[js.Any], easeParams.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetEasedPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](line: typings.phaser.Phaser.Geom.Line, ease: js.Function, quantity: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetEasedPoints")(line.asInstanceOf[js.Any], ease.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetEasedPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](
      line: typings.phaser.Phaser.Geom.Line,
      ease: js.Function,
      quantity: Double,
      collinearThreshold: Double
    ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetEasedPoints")(line.asInstanceOf[js.Any], ease.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], collinearThreshold.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetEasedPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](
      line: typings.phaser.Phaser.Geom.Line,
      ease: js.Function,
      quantity: Double,
      collinearThreshold: Double,
      easeParams: js.Array[Double]
    ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetEasedPoints")(line.asInstanceOf[js.Any], ease.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], collinearThreshold.asInstanceOf[js.Any], easeParams.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetEasedPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](
      line: typings.phaser.Phaser.Geom.Line,
      ease: js.Function,
      quantity: Double,
      collinearThreshold: Unit,
      easeParams: js.Array[Double]
    ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetEasedPoints")(line.asInstanceOf[js.Any], ease.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], collinearThreshold.asInstanceOf[js.Any], easeParams.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Get the midpoint of the given line.
      * @param line The line to get the midpoint of.
      * @param out An optional point object to store the midpoint in.
      */
    /* static member */
    inline def GetMidPoint[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line): O = ^.asInstanceOf[js.Dynamic].applyDynamic("GetMidPoint")(line.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def GetMidPoint[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetMidPoint")(line.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    inline def GetNearestPoint[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, point: js.Object): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetNearestPoint")(line.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetNearestPoint[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, point: js.Object, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetNearestPoint")(line.asInstanceOf[js.Any], point.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    /**
      * Get the nearest point on a line perpendicular to the given point.
      * @param line The line to get the nearest point on.
      * @param point The point to get the nearest point to.
      * @param out An optional point, or point-like object, to store the coordinates of the nearest point on the line.
      */
    /* static member */
    inline def GetNearestPoint[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, point: typings.phaser.Phaser.Geom.Point): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetNearestPoint")(line.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetNearestPoint[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, point: typings.phaser.Phaser.Geom.Point, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetNearestPoint")(line.asInstanceOf[js.Any], point.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Calculate the normal of the given line.
      * 
      * The normal of a line is a vector that points perpendicular from it.
      * @param line The line to calculate the normal of.
      * @param out An optional point object to store the normal in.
      */
    /* static member */
    inline def GetNormal[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line): O = ^.asInstanceOf[js.Dynamic].applyDynamic("GetNormal")(line.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def GetNormal[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetNormal")(line.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Get a point on a line that's a given percentage along its length.
      * @param line The line.
      * @param position A value between 0 and 1, where 0 is the start, 0.5 is the middle and 1 is the end of the line.
      * @param out An optional point, or point-like object, to store the coordinates of the point on the line.
      */
    /* static member */
    inline def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, position: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoint")(line.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, position: Double, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoint")(line.asInstanceOf[js.Any], position.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Get a number of points along a line's length.
      * 
      * Provide a `quantity` to get an exact number of points along the line.
      * 
      * Provide a `stepRate` to ensure a specific distance between each point on the line. Set `quantity` to `0` when
      * providing a `stepRate`.
      * @param line The line.
      * @param quantity The number of points to place on the line. Set to `0` to use `stepRate` instead.
      * @param stepRate The distance between each point on the line. When set, `quantity` is implied and should be set to `0`.
      * @param out An optional array of Points, or point-like objects, to store the coordinates of the points on the line.
      */
    /* static member */
    inline def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](line: typings.phaser.Phaser.Geom.Line, quantity: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(line.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](line: typings.phaser.Phaser.Geom.Line, quantity: Double, stepRate: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(line.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], stepRate.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](line: typings.phaser.Phaser.Geom.Line, quantity: Double, stepRate: Double, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(line.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], stepRate.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](line: typings.phaser.Phaser.Geom.Line, quantity: Double, stepRate: Unit, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(line.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], stepRate.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    inline def GetShortestDistance[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, point: js.Object): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetShortestDistance")(line.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[O]
    /**
      * Get the shortest distance from a Line to the given Point.
      * @param line The line to get the distance from.
      * @param point The point to get the shortest distance to.
      */
    /* static member */
    inline def GetShortestDistance[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, point: typings.phaser.Phaser.Geom.Point): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetShortestDistance")(line.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Calculate the height of the given line.
      * @param line The line to calculate the height of.
      */
    /* static member */
    inline def Height(line: typings.phaser.Phaser.Geom.Line): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Height")(line.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calculate the length of the given line.
      * @param line The line to calculate the length of.
      */
    /* static member */
    inline def Length(line: typings.phaser.Phaser.Geom.Line): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Length")(line.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Get the angle of the normal of the given line in radians.
      * @param line The line to calculate the angle of the normal of.
      */
    /* static member */
    inline def NormalAngle(line: typings.phaser.Phaser.Geom.Line): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("NormalAngle")(line.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns the x component of the normal vector of the given line.
      * @param line The Line object to get the normal value from.
      */
    /* static member */
    inline def NormalX(line: typings.phaser.Phaser.Geom.Line): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("NormalX")(line.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * The Y value of the normal of the given line.
      * The normal of a line is a vector that points perpendicular from it.
      * @param line The line to calculate the normal of.
      */
    /* static member */
    inline def NormalY(line: typings.phaser.Phaser.Geom.Line): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("NormalY")(line.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Offset a line by the given amount.
      * @param line The line to offset.
      * @param x The horizontal offset to add to the line.
      * @param y The vertical offset to add to the line.
      */
    /* static member */
    inline def Offset[O /* <: typings.phaser.Phaser.Geom.Line */](line: O, x: Double, y: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Offset")(line.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Calculate the perpendicular slope of the given line.
      * @param line The line to calculate the perpendicular slope of.
      */
    /* static member */
    inline def PerpSlope(line: typings.phaser.Phaser.Geom.Line): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("PerpSlope")(line.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns a random point on a given Line.
      * @param line The Line to calculate the random Point on.
      * @param out An instance of a Point to be modified.
      */
    /* static member */
    inline def Random[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line): O = ^.asInstanceOf[js.Dynamic].applyDynamic("Random")(line.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def Random[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Random")(line.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Calculate the reflected angle between two lines.
      * 
      * This is the outgoing angle based on the angle of Line 1 and the normalAngle of Line 2.
      * @param lineA The first line.
      * @param lineB The second line.
      */
    /* static member */
    inline def ReflectAngle(lineA: typings.phaser.Phaser.Geom.Line, lineB: typings.phaser.Phaser.Geom.Line): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ReflectAngle")(lineA.asInstanceOf[js.Any], lineB.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Rotate a line around its midpoint by the given angle in radians.
      * @param line The line to rotate.
      * @param angle The angle of rotation in radians.
      */
    /* static member */
    inline def Rotate[O /* <: typings.phaser.Phaser.Geom.Line */](line: O, angle: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Rotate")(line.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[O]
    
    inline def RotateAroundPoint[O /* <: typings.phaser.Phaser.Geom.Line */](line: O, point: js.Object, angle: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateAroundPoint")(line.asInstanceOf[js.Any], point.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[O]
    /**
      * Rotate a line around a point by the given angle in radians.
      * @param line The line to rotate.
      * @param point The point to rotate the line around.
      * @param angle The angle of rotation in radians.
      */
    /* static member */
    inline def RotateAroundPoint[O /* <: typings.phaser.Phaser.Geom.Line */](line: O, point: typings.phaser.Phaser.Geom.Point, angle: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateAroundPoint")(line.asInstanceOf[js.Any], point.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Rotate a line around the given coordinates by the given angle in radians.
      * @param line The line to rotate.
      * @param x The horizontal coordinate to rotate the line around.
      * @param y The vertical coordinate to rotate the line around.
      * @param angle The angle of rotation in radians.
      */
    /* static member */
    inline def RotateAroundXY[O /* <: typings.phaser.Phaser.Geom.Line */](line: O, x: Double, y: Double, angle: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateAroundXY")(line.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Set a line to a given position, angle and length.
      * @param line The line to set.
      * @param x The horizontal start position of the line.
      * @param y The vertical start position of the line.
      * @param angle The angle of the line in radians.
      * @param length The length of the line.
      */
    /* static member */
    inline def SetToAngle[O /* <: typings.phaser.Phaser.Geom.Line */](line: O, x: Double, y: Double, angle: Double, length: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("SetToAngle")(line.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Calculate the slope of the given line.
      * @param line The line to calculate the slope of.
      */
    /* static member */
    inline def Slope(line: typings.phaser.Phaser.Geom.Line): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Slope")(line.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calculate the width of the given line.
      * @param line The line to calculate the width of.
      */
    /* static member */
    inline def Width(line: typings.phaser.Phaser.Geom.Line): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Width")(line.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  object Mesh {
    
    @JSImport("phaser", "Geom.Mesh")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A Face Geometry Object.
      * 
      * A Face is used by the Mesh Game Object. A Mesh consists of one, or more, faces that are
      * used to render the Mesh Game Objects in WebGL.
      * 
      * A Face consists of 3 Vertex instances, for the 3 corners of the face and methods to help
      * you modify and test them.
      */
    @JSImport("phaser", "Geom.Mesh.Face")
    @js.native
    open class Face protected ()
      extends StObject
         with typings.phaser.Phaser.Geom.Mesh.Face {
      /**
        * 
        * @param vertex1 The first vertex of the Face.
        * @param vertex2 The second vertex of the Face.
        * @param vertex3 The third vertex of the Face.
        */
      def this(
        vertex1: typings.phaser.Phaser.Geom.Mesh.Vertex,
        vertex2: typings.phaser.Phaser.Geom.Mesh.Vertex,
        vertex3: typings.phaser.Phaser.Geom.Mesh.Vertex
      ) = this()
    }
    
    /**
      * Creates a grid of vertices based on the given configuration object and optionally adds it to a Mesh.
      * 
      * The size of the grid is given in pixels. An example configuration may be:
      * 
      * `{ width: 256, height: 256, widthSegments: 2, heightSegments: 2, tile: true }`
      * 
      * This will create a grid 256 x 256 pixels in size, split into 2 x 2 segments, with
      * the texture tiling across the cells.
      * 
      * You can split the grid into segments both vertically and horizontally. This will
      * generate two faces per grid segment as a result.
      * 
      * The `tile` parameter allows you to control if the tile will repeat across the grid
      * segments, or be displayed in full.
      * 
      * If adding this grid to a Mesh you can offset the grid via the `x` and `y` properties.
      * 
      * UV coordinates are generated based on the given texture and frame in the config. For
      * example, no frame is given, the UVs will be in the range 0 to 1. If a frame is given,
      * such as from a texture atlas, the UVs will be generated within the range of that frame.
      * @param config A Grid configuration object.
      */
    inline def GenerateGridVerts(config: GenerateGridConfig): GenerateGridVertsResult = ^.asInstanceOf[js.Dynamic].applyDynamic("GenerateGridVerts")(config.asInstanceOf[js.Any]).asInstanceOf[GenerateGridVertsResult]
    
    /**
      * This method will return an object containing Face and Vertex instances, generated
      * from the parsed triangulated OBJ Model data given to this function.
      * 
      * The obj data should have been parsed in advance via the ParseObj function:
      * 
      * ```javascript
      * var data = Phaser.Geom.Mesh.ParseObj(rawData, flipUV);
      * 
      * var results = GenerateObjVerts(data);
      * ```
      * 
      * Alternatively, you can parse obj files loaded via the OBJFile loader:
      * 
      * ```javascript
      * preload ()
      * {
      *   this.load.obj('alien', 'assets/3d/alien.obj);
      * }
      * 
      * var results = GenerateObjVerts(this.cache.obj.get('alien));
      * ```
      * 
      * Make sure your 3D package has triangulated the model data prior to exporting it.
      * 
      * You can use the data returned by this function to populate the vertices of a Mesh Game Object.
      * 
      * You may add multiple models to a single Mesh, although they will act as one when
      * moved or rotated. You can scale the model data, should it be too small (or large) to visualize.
      * You can also offset the model via the `x`, `y` and `z` parameters.
      * @param data The parsed OBJ model data.
      * @param mesh An optional Mesh Game Object. If given, the generated Faces will be automatically added to this Mesh. Set to `null` to skip.
      * @param scale An amount to scale the model data by. Use this if the model has exported too small, or large, to see. Default 1.
      * @param x Translate the model x position by this amount. Default 0.
      * @param y Translate the model y position by this amount. Default 0.
      * @param z Translate the model z position by this amount. Default 0.
      * @param rotateX Rotate the model on the x axis by this amount, in radians. Default 0.
      * @param rotateY Rotate the model on the y axis by this amount, in radians. Default 0.
      * @param rotateZ Rotate the model on the z axis by this amount, in radians. Default 0.
      * @param zIsUp Is the z axis up (true), or is y axis up (false)? Default true.
      */
    inline def GenerateObjVerts(
      data: OBJData,
      mesh: js.UndefOr[typings.phaser.Phaser.GameObjects.Mesh],
      scale: js.UndefOr[Double],
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      z: js.UndefOr[Double],
      rotateX: js.UndefOr[Double],
      rotateY: js.UndefOr[Double],
      rotateZ: js.UndefOr[Double],
      zIsUp: js.UndefOr[Boolean]
    ): GenerateVertsResult = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateObjVerts")(data.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], rotateX.asInstanceOf[js.Any], rotateY.asInstanceOf[js.Any], rotateZ.asInstanceOf[js.Any], zIsUp.asInstanceOf[js.Any])).asInstanceOf[GenerateVertsResult]
    
    /**
      * Generates a set of Face and Vertex objects by parsing the given data.
      * 
      * This method will take vertex data in one of two formats, based on the `containsZ` parameter.
      * 
      * If your vertex data are `x`, `y` pairs, then `containsZ` should be `false` (this is the default)
      * 
      * If your vertex data is groups of `x`, `y` and `z` values, then the `containsZ` parameter must be true.
      * 
      * The `uvs` parameter is a numeric array consisting of `u` and `v` pairs.
      * 
      * The `normals` parameter is a numeric array consisting of `x`, `y` vertex normal values and, if `containsZ` is true, `z` values as well.
      * 
      * The `indicies` parameter is an optional array that, if given, is an indexed list of vertices to be added.
      * 
      * The `colors` parameter is an optional array, or single value, that if given sets the color of each vertex created.
      * 
      * The `alphas` parameter is an optional array, or single value, that if given sets the alpha of each vertex created.
      * 
      * When providing indexed data it is assumed that _all_ of the arrays are indexed, not just the vertices.
      * 
      * The following example will create a 256 x 256 sized quad using an index array:
      * 
      * ```javascript
      * const vertices = [
      *   -128, 128,
      *   128, 128,
      *   -128, -128,
      *   128, -128
      * ];
      * 
      * const uvs = [
      *   0, 1,
      *   1, 1,
      *   0, 0,
      *   1, 0
      * ];
      * 
      * const indices = [ 0, 2, 1, 2, 3, 1 ];
      * 
      * GenerateVerts(vertices, uvs, indicies);
      * ```
      * 
      * If the data is not indexed, it's assumed that the arrays all contain sequential data.
      * @param vertices The vertices array. Either `xy` pairs, or `xyz` if the `containsZ` parameter is `true`.
      * @param uvs The UVs pairs array.
      * @param indicies Optional vertex indicies array. If you don't have one, pass `null` or an empty array.
      * @param containsZ Does the vertices data include a `z` component? Default false.
      * @param normals Optional vertex normals array. If you don't have one, pass `null` or an empty array.
      * @param colors An array of colors, one per vertex, or a single color value applied to all vertices. Default 0xffffff.
      * @param alphas An array of alpha values, one per vertex, or a single alpha value applied to all vertices. Default 1.
      */
    inline def GenerateVerts(
      vertices: js.Array[Double],
      uvs: js.Array[Double],
      indicies: js.UndefOr[js.Array[Double]],
      containsZ: js.UndefOr[Boolean],
      normals: js.UndefOr[js.Array[Double]],
      colors: js.UndefOr[Double | js.Array[Double]],
      alphas: js.UndefOr[Double | js.Array[Double]]
    ): GenerateVertsResult = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateVerts")(vertices.asInstanceOf[js.Any], uvs.asInstanceOf[js.Any], indicies.asInstanceOf[js.Any], containsZ.asInstanceOf[js.Any], normals.asInstanceOf[js.Any], colors.asInstanceOf[js.Any], alphas.asInstanceOf[js.Any])).asInstanceOf[GenerateVertsResult]
    
    /**
      * Parses a Wavefront OBJ File, extracting the models from it and returning them in an array.
      * 
      * The model data *must* be triangulated for a Mesh Game Object to be able to render it.
      * @param data The OBJ File data as a raw string.
      * @param flipUV Flip the UV coordinates? Default true.
      */
    inline def ParseObj(data: String): OBJData = ^.asInstanceOf[js.Dynamic].applyDynamic("ParseObj")(data.asInstanceOf[js.Any]).asInstanceOf[OBJData]
    inline def ParseObj(data: String, flipUV: Boolean): OBJData = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseObj")(data.asInstanceOf[js.Any], flipUV.asInstanceOf[js.Any])).asInstanceOf[OBJData]
    
    /**
      * Takes a Wavefront Material file and extracts the diffuse reflectivity of the named
      * materials, converts them to integer color values and returns them.
      * 
      * This is used internally by the `addOBJ` and `addModel` methods, but is exposed for
      * public consumption as well.
      * 
      * Note this only works with diffuse values, specified in the `Kd r g b` format, where
      * `g` and `b` are optional, but `r` is required. It does not support spectral rfl files,
      * or any other material statement (such as `Ka` or `Ks`)
      * @param mtl The OBJ MTL file as a raw string, i.e. loaded via `this.load.text`.
      */
    inline def ParseObjMaterial(mtl: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("ParseObjMaterial")(mtl.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    /**
      * Rotates the vertices of a Face to the given angle.
      * 
      * The actual vertex positions are adjusted, not their transformed positions.
      * 
      * Therefore, this updates the vertex data directly.
      * @param face The Face to rotate.
      * @param angle The angle to rotate to, in radians.
      * @param cx An optional center of rotation. If not given, the Face in-center is used.
      * @param cy An optional center of rotation. If not given, the Face in-center is used.
      */
    inline def RotateFace(face: typings.phaser.Phaser.Geom.Mesh.Face, angle: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateFace")(face.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def RotateFace(face: typings.phaser.Phaser.Geom.Mesh.Face, angle: Double, cx: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateFace")(face.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], cx.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def RotateFace(face: typings.phaser.Phaser.Geom.Mesh.Face, angle: Double, cx: Double, cy: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateFace")(face.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def RotateFace(face: typings.phaser.Phaser.Geom.Mesh.Face, angle: Double, cx: Unit, cy: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateFace")(face.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * A Vertex Geometry Object.
      * 
      * This class consists of all the information required for a single vertex within a Face Geometry Object.
      * 
      * Faces, and thus Vertex objects, are used by the Mesh Game Object in order to render objects in WebGL.
      */
    @JSImport("phaser", "Geom.Mesh.Vertex")
    @js.native
    open class Vertex protected ()
      extends StObject
         with typings.phaser.Phaser.Geom.Mesh.Vertex {
      /**
        * 
        * @param x The x position of the vertex.
        * @param y The y position of the vertex.
        * @param z The z position of the vertex.
        * @param u The UV u coordinate of the vertex.
        * @param v The UV v coordinate of the vertex.
        * @param color The color value of the vertex. Default 0xffffff.
        * @param alpha The alpha value of the vertex. Default 1.
        * @param nx The x normal value of the vertex. Default 0.
        * @param ny The y normal value of the vertex. Default 0.
        * @param nz The z normal value of the vertex. Default 0.
        */
      def this(x: Double, y: Double, z: Double, u: Double, v: Double) = this()
      def this(x: Double, y: Double, z: Double, u: Double, v: Double, color: Double) = this()
      def this(x: Double, y: Double, z: Double, u: Double, v: Double, color: Double, alpha: Double) = this()
      def this(x: Double, y: Double, z: Double, u: Double, v: Double, color: Unit, alpha: Double) = this()
      def this(x: Double, y: Double, z: Double, u: Double, v: Double, color: Double, alpha: Double, nx: Double) = this()
      def this(x: Double, y: Double, z: Double, u: Double, v: Double, color: Double, alpha: Unit, nx: Double) = this()
      def this(x: Double, y: Double, z: Double, u: Double, v: Double, color: Unit, alpha: Double, nx: Double) = this()
      def this(x: Double, y: Double, z: Double, u: Double, v: Double, color: Unit, alpha: Unit, nx: Double) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Double,
        alpha: Double,
        nx: Double,
        ny: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Double,
        alpha: Double,
        nx: Unit,
        ny: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Double,
        alpha: Unit,
        nx: Double,
        ny: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Double,
        alpha: Unit,
        nx: Unit,
        ny: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Unit,
        alpha: Double,
        nx: Double,
        ny: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Unit,
        alpha: Double,
        nx: Unit,
        ny: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Unit,
        alpha: Unit,
        nx: Double,
        ny: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Unit,
        alpha: Unit,
        nx: Unit,
        ny: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Double,
        alpha: Double,
        nx: Double,
        ny: Double,
        nz: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Double,
        alpha: Double,
        nx: Double,
        ny: Unit,
        nz: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Double,
        alpha: Double,
        nx: Unit,
        ny: Double,
        nz: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Double,
        alpha: Double,
        nx: Unit,
        ny: Unit,
        nz: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Double,
        alpha: Unit,
        nx: Double,
        ny: Double,
        nz: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Double,
        alpha: Unit,
        nx: Double,
        ny: Unit,
        nz: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Double,
        alpha: Unit,
        nx: Unit,
        ny: Double,
        nz: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Double,
        alpha: Unit,
        nx: Unit,
        ny: Unit,
        nz: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Unit,
        alpha: Double,
        nx: Double,
        ny: Double,
        nz: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Unit,
        alpha: Double,
        nx: Double,
        ny: Unit,
        nz: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Unit,
        alpha: Double,
        nx: Unit,
        ny: Double,
        nz: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Unit,
        alpha: Double,
        nx: Unit,
        ny: Unit,
        nz: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Unit,
        alpha: Unit,
        nx: Double,
        ny: Double,
        nz: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Unit,
        alpha: Unit,
        nx: Double,
        ny: Unit,
        nz: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Unit,
        alpha: Unit,
        nx: Unit,
        ny: Double,
        nz: Double
      ) = this()
      def this(
        x: Double,
        y: Double,
        z: Double,
        u: Double,
        v: Double,
        color: Unit,
        alpha: Unit,
        nx: Unit,
        ny: Unit,
        nz: Double
      ) = this()
    }
  }
  
  /**
    * A Point Geometry object type.
    */
  @JSImport("phaser", "Geom.POINT")
  @js.native
  def POINT_ : Double = js.native
  
  inline def POINT__=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POINT")(x.asInstanceOf[js.Any])
  
  /**
    * A Polygon Geometry object type.
    */
  @JSImport("phaser", "Geom.POLYGON")
  @js.native
  def POLYGON_ : Double = js.native
  
  inline def POLYGON__=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POLYGON")(x.asInstanceOf[js.Any])
  
  /**
    * Defines a Point in 2D space, with an x and y component.
    */
  @JSImport("phaser", "Geom.Point")
  @js.native
  /**
    * 
    * @param x The x coordinate of this Point. Default 0.
    * @param y The y coordinate of this Point. Default x.
    */
  open class Point ()
    extends StObject
       with typings.phaser.Phaser.Geom.Point {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
  }
  object Point {
    
    @JSImport("phaser", "Geom.Point")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Apply `Math.ceil()` to each coordinate of the given Point.
      * @param point The Point to ceil.
      */
    /* static member */
    inline def Ceil[O /* <: typings.phaser.Phaser.Geom.Point */](point: O): O = ^.asInstanceOf[js.Dynamic].applyDynamic("Ceil")(point.asInstanceOf[js.Any]).asInstanceOf[O]
    
    /**
      * Clone the given Point.
      * @param source The source Point to clone.
      */
    /* static member */
    inline def Clone(source: typings.phaser.Phaser.Geom.Point): typings.phaser.Phaser.Geom.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("Clone")(source.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.Phaser.Geom.Point]
    
    /**
      * Copy the values of one Point to a destination Point.
      * @param source The source Point to copy the values from.
      * @param dest The destination Point to copy the values to.
      */
    /* static member */
    inline def CopyFrom[O /* <: typings.phaser.Phaser.Geom.Point */](source: typings.phaser.Phaser.Geom.Point, dest: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("CopyFrom")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * A comparison of two `Point` objects to see if they are equal.
      * @param point The original `Point` to compare against.
      * @param toCompare The second `Point` to compare.
      */
    /* static member */
    inline def Equals(point: typings.phaser.Phaser.Geom.Point, toCompare: typings.phaser.Phaser.Geom.Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Equals")(point.asInstanceOf[js.Any], toCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Apply `Math.ceil()` to each coordinate of the given Point.
      * @param point The Point to floor.
      */
    /* static member */
    inline def Floor[O /* <: typings.phaser.Phaser.Geom.Point */](point: O): O = ^.asInstanceOf[js.Dynamic].applyDynamic("Floor")(point.asInstanceOf[js.Any]).asInstanceOf[O]
    
    /**
      * Get the centroid or geometric center of a plane figure (the arithmetic mean position of all the points in the figure).
      * Informally, it is the point at which a cutout of the shape could be perfectly balanced on the tip of a pin.
      * @param points An array of Vector2Like objects to get the geometric center of.
      * @param out A Point object to store the output coordinates in. If not given, a new Point instance is created.
      */
    /* static member */
    inline def GetCentroid[O /* <: typings.phaser.Phaser.Geom.Point */](points: js.Array[Vector2Like]): O = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCentroid")(points.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def GetCentroid[O /* <: typings.phaser.Phaser.Geom.Point */](points: js.Array[Vector2Like], out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCentroid")(points.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Calculate the magnitude of the point, which equivalent to the length of the line from the origin to this point.
      * @param point The point to calculate the magnitude for
      */
    /* static member */
    inline def GetMagnitude(point: typings.phaser.Phaser.Geom.Point): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetMagnitude")(point.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calculates the square of magnitude of given point.(Can be used for fast magnitude calculation of point)
      * @param point Returns square of the magnitude/length of given point.
      */
    /* static member */
    inline def GetMagnitudeSq(point: typings.phaser.Phaser.Geom.Point): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetMagnitudeSq")(point.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calculates the Axis Aligned Bounding Box (or aabb) from an array of points.
      * @param points An array of Vector2Like objects to get the AABB from.
      * @param out A Rectangle object to store the results in. If not given, a new Rectangle instance is created.
      */
    /* static member */
    inline def GetRectangleFromPoints[O /* <: typings.phaser.Phaser.Geom.Rectangle */](points: js.Array[Vector2Like]): O = ^.asInstanceOf[js.Dynamic].applyDynamic("GetRectangleFromPoints")(points.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def GetRectangleFromPoints[O /* <: typings.phaser.Phaser.Geom.Rectangle */](points: js.Array[Vector2Like], out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetRectangleFromPoints")(points.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Returns the linear interpolation point between the two given points, based on `t`.
      * @param pointA The starting `Point` for the interpolation.
      * @param pointB The target `Point` for the interpolation.
      * @param t The amount to interpolate between the two points. Generally, a value between 0 (returns the starting `Point`) and 1 (returns the target `Point`). If omitted, 0 is used. Default 0.
      * @param out An optional `Point` object whose `x` and `y` values will be set to the result of the interpolation (can also be any object with `x` and `y` properties). If omitted, a new `Point` created and returned.
      */
    /* static member */
    inline def Interpolate[O /* <: typings.phaser.Phaser.Geom.Point */](pointA: typings.phaser.Phaser.Geom.Point, pointB: typings.phaser.Phaser.Geom.Point): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Interpolate")(pointA.asInstanceOf[js.Any], pointB.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def Interpolate[O /* <: typings.phaser.Phaser.Geom.Point */](pointA: typings.phaser.Phaser.Geom.Point, pointB: typings.phaser.Phaser.Geom.Point, t: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Interpolate")(pointA.asInstanceOf[js.Any], pointB.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def Interpolate[O /* <: typings.phaser.Phaser.Geom.Point */](
      pointA: typings.phaser.Phaser.Geom.Point,
      pointB: typings.phaser.Phaser.Geom.Point,
      t: Double,
      out: O
    ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Interpolate")(pointA.asInstanceOf[js.Any], pointB.asInstanceOf[js.Any], t.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def Interpolate[O /* <: typings.phaser.Phaser.Geom.Point */](
      pointA: typings.phaser.Phaser.Geom.Point,
      pointB: typings.phaser.Phaser.Geom.Point,
      t: Unit,
      out: O
    ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Interpolate")(pointA.asInstanceOf[js.Any], pointB.asInstanceOf[js.Any], t.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Swaps the X and the Y coordinate of a point.
      * @param point The Point to modify.
      */
    /* static member */
    inline def Invert[O /* <: typings.phaser.Phaser.Geom.Point */](point: O): O = ^.asInstanceOf[js.Dynamic].applyDynamic("Invert")(point.asInstanceOf[js.Any]).asInstanceOf[O]
    
    /**
      * Inverts a Point's coordinates.
      * @param point The Point to invert.
      * @param out The Point to return the inverted coordinates in.
      */
    /* static member */
    inline def Negative[O /* <: typings.phaser.Phaser.Geom.Point */](point: typings.phaser.Phaser.Geom.Point): O = ^.asInstanceOf[js.Dynamic].applyDynamic("Negative")(point.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def Negative[O /* <: typings.phaser.Phaser.Geom.Point */](point: typings.phaser.Phaser.Geom.Point, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Negative")(point.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Calculates the vector projection of `pointA` onto the nonzero `pointB`. This is the
      * orthogonal projection of `pointA` onto a straight line parallel to `pointB`.
      * @param pointA Point A, to be projected onto Point B.
      * @param pointB Point B, to have Point A projected upon it.
      * @param out The Point object to store the position in. If not given, a new Point instance is created.
      */
    /* static member */
    inline def Project[O /* <: typings.phaser.Phaser.Geom.Point */](pointA: typings.phaser.Phaser.Geom.Point, pointB: typings.phaser.Phaser.Geom.Point): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Project")(pointA.asInstanceOf[js.Any], pointB.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def Project[O /* <: typings.phaser.Phaser.Geom.Point */](pointA: typings.phaser.Phaser.Geom.Point, pointB: typings.phaser.Phaser.Geom.Point, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Project")(pointA.asInstanceOf[js.Any], pointB.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Calculates the vector projection of `pointA` onto the nonzero `pointB`. This is the
      * orthogonal projection of `pointA` onto a straight line paralle to `pointB`.
      * @param pointA Point A, to be projected onto Point B. Must be a normalized point with a magnitude of 1.
      * @param pointB Point B, to have Point A projected upon it.
      * @param out The Point object to store the position in. If not given, a new Point instance is created.
      */
    /* static member */
    inline def ProjectUnit[O /* <: typings.phaser.Phaser.Geom.Point */](pointA: typings.phaser.Phaser.Geom.Point, pointB: typings.phaser.Phaser.Geom.Point): O = (^.asInstanceOf[js.Dynamic].applyDynamic("ProjectUnit")(pointA.asInstanceOf[js.Any], pointB.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def ProjectUnit[O /* <: typings.phaser.Phaser.Geom.Point */](pointA: typings.phaser.Phaser.Geom.Point, pointB: typings.phaser.Phaser.Geom.Point, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("ProjectUnit")(pointA.asInstanceOf[js.Any], pointB.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Changes the magnitude (length) of a two-dimensional vector without changing its direction.
      * @param point The Point to treat as the end point of the vector.
      * @param magnitude The new magnitude of the vector.
      */
    /* static member */
    inline def SetMagnitude[O /* <: typings.phaser.Phaser.Geom.Point */](point: O, magnitude: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("SetMagnitude")(point.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any])).asInstanceOf[O]
  }
  
  /**
    * A Polygon object
    * 
    * The polygon is a closed shape consists of a series of connected straight lines defined by list of ordered points.
    * Several formats are supported to define the list of points, check the setTo method for details.
    * This is a geometry object allowing you to define and inspect the shape.
    * It is not a Game Object, in that you cannot add it to the display list, and it has no texture.
    * To render a Polygon you should look at the capabilities of the Graphics class.
    */
  @JSImport("phaser", "Geom.Polygon")
  @js.native
  /**
    * 
    * @param points List of points defining the perimeter of this Polygon. Several formats are supported:
    * - A string containing paired x y values separated by a single space: `'40 0 40 20 100 20 100 80 40 80 40 100 0 50'`
    * - An array of Point objects: `[new Phaser.Point(x1, y1), ...]`
    * - An array of objects with public x y properties: `[obj1, obj2, ...]`
    * - An array of paired numbers that represent point coordinates: `[x1,y1, x2,y2, ...]`
    * - An array of arrays with two elements representing x/y coordinates: `[[x1, y1], [x2, y2], ...]`
    */
  open class Polygon ()
    extends StObject
       with typings.phaser.Phaser.Geom.Polygon {
    def this(points: String) = this()
    def this(points: js.Array[Double | Vector2Like]) = this()
  }
  object Polygon {
    
    @JSImport("phaser", "Geom.Polygon")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new polygon which is a copy of the specified polygon
      * @param polygon The polygon to create a clone of
      */
    /* static member */
    inline def Clone(polygon: typings.phaser.Phaser.Geom.Polygon): typings.phaser.Phaser.Geom.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("Clone")(polygon.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.Phaser.Geom.Polygon]
    
    /**
      * Checks if a point is within the bounds of a Polygon.
      * @param polygon The Polygon to check against.
      * @param x The X coordinate of the point to check.
      * @param y The Y coordinate of the point to check.
      */
    /* static member */
    inline def Contains(polygon: typings.phaser.Phaser.Geom.Polygon, x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Contains")(polygon.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Checks the given Point again the Polygon to see if the Point lays within its vertices.
      * @param polygon The Polygon to check.
      * @param point The Point to check if it's within the Polygon.
      */
    /* static member */
    inline def ContainsPoint(polygon: typings.phaser.Phaser.Geom.Polygon, point: typings.phaser.Phaser.Geom.Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ContainsPoint")(polygon.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * This module implements a modified ear slicing algorithm, optimized by z-order curve hashing and extended to
      * handle holes, twisted polygons, degeneracies and self-intersections in a way that doesn't guarantee correctness
      * of triangulation, but attempts to always produce acceptable results for practical data.
      * 
      * Example:
      * 
      * ```javascript
      * const triangles = Phaser.Geom.Polygon.Earcut([10,0, 0,50, 60,60, 70,10]); // returns [1,0,3, 3,2,1]
      * ```
      * 
      * Each group of three vertex indices in the resulting array forms a triangle.
      * 
      * ```javascript
      * // triangulating a polygon with a hole
      * earcut([0,0, 100,0, 100,100, 0,100,  20,20, 80,20, 80,80, 20,80], [4]);
      * // [3,0,4, 5,4,0, 3,4,7, 5,0,1, 2,3,7, 6,5,1, 2,7,6, 6,1,2]
      * 
      * // triangulating a polygon with 3d coords
      * earcut([10,0,1, 0,50,2, 60,60,3, 70,10,4], null, 3);
      * // [1,0,3, 3,2,1]
      * ```
      * 
      * If you pass a single vertex as a hole, Earcut treats it as a Steiner point.
      * 
      * If your input is a multi-dimensional array (e.g. GeoJSON Polygon), you can convert it to the format
      * expected by Earcut with `Phaser.Geom.Polygon.Earcut.flatten`:
      * 
      * ```javascript
      * var data = earcut.flatten(geojson.geometry.coordinates);
      * var triangles = earcut(data.vertices, data.holes, data.dimensions);
      * ```
      * 
      * After getting a triangulation, you can verify its correctness with `Phaser.Geom.Polygon.Earcut.deviation`:
      * 
      * ```javascript
      * var deviation = earcut.deviation(vertices, holes, dimensions, triangles);
      * ```
      * Returns the relative difference between the total area of triangles and the area of the input polygon.
      * 0 means the triangulation is fully correct.
      * 
      * For more information see https://github.com/mapbox/earcut
      * @param data A flat array of vertex coordinate, like [x0,y0, x1,y1, x2,y2, ...]
      * @param holeIndices An array of hole indices if any (e.g. [5, 8] for a 12-vertex input would mean one hole with vertices 5–7 and another with 8–11).
      * @param dimensions The number of coordinates per vertex in the input array (2 by default). Default 2.
      */
    /* static member */
    inline def Earcut(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("Earcut")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    inline def Earcut(data: js.Array[Double], holeIndices: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Earcut")(data.asInstanceOf[js.Any], holeIndices.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def Earcut(data: js.Array[Double], holeIndices: js.Array[Double], dimensions: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Earcut")(data.asInstanceOf[js.Any], holeIndices.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def Earcut(data: js.Array[Double], holeIndices: Unit, dimensions: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Earcut")(data.asInstanceOf[js.Any], holeIndices.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Calculates the bounding AABB rectangle of a polygon.
      * @param polygon The polygon that should be calculated.
      * @param out The rectangle or object that has x, y, width, and height properties to store the result. Optional.
      */
    /* static member */
    inline def GetAABB[O /* <: typings.phaser.Phaser.Geom.Rectangle */](polygon: typings.phaser.Phaser.Geom.Polygon): O = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAABB")(polygon.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def GetAABB[O /* <: typings.phaser.Phaser.Geom.Rectangle */](polygon: typings.phaser.Phaser.Geom.Polygon, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAABB")(polygon.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Stores all of the points of a Polygon into a flat array of numbers following the sequence [ x,y, x,y, x,y ],
      * i.e. each point of the Polygon, in the order it's defined, corresponds to two elements of the resultant
      * array for the point's X and Y coordinate.
      * @param polygon The Polygon whose points to export.
      * @param output An array to which the points' coordinates should be appended.
      */
    /* static member */
    inline def GetNumberArray[O /* <: js.Array[Double] */](polygon: typings.phaser.Phaser.Geom.Polygon): O = ^.asInstanceOf[js.Dynamic].applyDynamic("GetNumberArray")(polygon.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def GetNumberArray[O /* <: js.Array[Double] */](polygon: typings.phaser.Phaser.Geom.Polygon, output: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetNumberArray")(polygon.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Returns an array of Point objects containing the coordinates of the points around the perimeter of the Polygon,
      * based on the given quantity or stepRate values.
      * @param polygon The Polygon to get the points from.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the perimeter of the Polygon and dividing it by the stepRate.
      * @param output An array to insert the points in to. If not provided a new array will be created.
      */
    /* static member */
    inline def GetPoints(polygon: typings.phaser.Phaser.Geom.Polygon, quantity: Double): js.Array[typings.phaser.Phaser.Geom.Point] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(polygon.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Geom.Point]]
    inline def GetPoints(polygon: typings.phaser.Phaser.Geom.Polygon, quantity: Double, stepRate: Double): js.Array[typings.phaser.Phaser.Geom.Point] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(polygon.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], stepRate.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Geom.Point]]
    inline def GetPoints(
      polygon: typings.phaser.Phaser.Geom.Polygon,
      quantity: Double,
      stepRate: Double,
      output: js.Array[Any]
    ): js.Array[typings.phaser.Phaser.Geom.Point] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(polygon.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], stepRate.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Geom.Point]]
    inline def GetPoints(
      polygon: typings.phaser.Phaser.Geom.Polygon,
      quantity: Double,
      stepRate: Unit,
      output: js.Array[Any]
    ): js.Array[typings.phaser.Phaser.Geom.Point] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(polygon.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], stepRate.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Geom.Point]]
    
    /**
      * Returns the perimeter of the given Polygon.
      * @param polygon The Polygon to get the perimeter of.
      */
    /* static member */
    inline def Perimeter(polygon: typings.phaser.Phaser.Geom.Polygon): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Perimeter")(polygon.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Reverses the order of the points of a Polygon.
      * @param polygon The Polygon to modify.
      */
    /* static member */
    inline def Reverse[O /* <: typings.phaser.Phaser.Geom.Polygon */](polygon: O): O = ^.asInstanceOf[js.Dynamic].applyDynamic("Reverse")(polygon.asInstanceOf[js.Any]).asInstanceOf[O]
    
    /**
      * Takes a Polygon object and simplifies the points by running them through a combination of
      * Douglas-Peucker and Radial Distance algorithms. Simplification dramatically reduces the number of
      * points in a polygon while retaining its shape, giving a huge performance boost when processing
      * it and also reducing visual noise.
      * @param polygon The polygon to be simplified. The polygon will be modified in-place and returned.
      * @param tolerance Affects the amount of simplification (in the same metric as the point coordinates). Default 1.
      * @param highestQuality Excludes distance-based preprocessing step which leads to highest quality simplification but runs ~10-20 times slower. Default false.
      */
    /* static member */
    inline def Simplify[O /* <: typings.phaser.Phaser.Geom.Polygon */](polygon: O): O = ^.asInstanceOf[js.Dynamic].applyDynamic("Simplify")(polygon.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def Simplify[O /* <: typings.phaser.Phaser.Geom.Polygon */](polygon: O, tolerance: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Simplify")(polygon.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def Simplify[O /* <: typings.phaser.Phaser.Geom.Polygon */](polygon: O, tolerance: Double, highestQuality: Boolean): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Simplify")(polygon.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], highestQuality.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def Simplify[O /* <: typings.phaser.Phaser.Geom.Polygon */](polygon: O, tolerance: Unit, highestQuality: Boolean): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Simplify")(polygon.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], highestQuality.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Takes a Polygon object and applies Chaikin's smoothing algorithm on its points.
      * @param polygon The polygon to be smoothed. The polygon will be modified in-place and returned.
      */
    /* static member */
    inline def Smooth[O /* <: typings.phaser.Phaser.Geom.Polygon */](polygon: O): O = ^.asInstanceOf[js.Dynamic].applyDynamic("Smooth")(polygon.asInstanceOf[js.Any]).asInstanceOf[O]
    
    /**
      * Tranlates the points of the given Polygon.
      * @param polygon The Polygon to modify.
      * @param x The amount to horizontally translate the points by.
      * @param y The amount to vertically translate the points by.
      */
    /* static member */
    inline def Translate[O /* <: typings.phaser.Phaser.Geom.Polygon */](polygon: O, x: Double, y: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Translate")(polygon.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[O]
  }
  
  /**
    * A Rectangle Geometry object type.
    */
  @JSImport("phaser", "Geom.RECTANGLE")
  @js.native
  def RECTANGLE_ : Double = js.native
  
  inline def RECTANGLE__=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RECTANGLE")(x.asInstanceOf[js.Any])
  
  /**
    * Encapsulates a 2D rectangle defined by its corner point in the top-left and its extends in x (width) and y (height)
    */
  @JSImport("phaser", "Geom.Rectangle")
  @js.native
  /**
    * 
    * @param x The X coordinate of the top left corner of the Rectangle. Default 0.
    * @param y The Y coordinate of the top left corner of the Rectangle. Default 0.
    * @param width The width of the Rectangle. Default 0.
    * @param height The height of the Rectangle. Default 0.
    */
  open class Rectangle ()
    extends StObject
       with typings.phaser.Phaser.Geom.Rectangle {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, width: Double) = this()
    def this(x: Double, y: Unit, width: Double) = this()
    def this(x: Unit, y: Double, width: Double) = this()
    def this(x: Unit, y: Unit, width: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    def this(x: Double, y: Double, width: Unit, height: Double) = this()
    def this(x: Double, y: Unit, width: Double, height: Double) = this()
    def this(x: Double, y: Unit, width: Unit, height: Double) = this()
    def this(x: Unit, y: Double, width: Double, height: Double) = this()
    def this(x: Unit, y: Double, width: Unit, height: Double) = this()
    def this(x: Unit, y: Unit, width: Double, height: Double) = this()
    def this(x: Unit, y: Unit, width: Unit, height: Double) = this()
  }
  object Rectangle {
    
    @JSImport("phaser", "Geom.Rectangle")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Calculates the area of the given Rectangle object.
      * @param rect The rectangle to calculate the area of.
      */
    /* static member */
    inline def Area(rect: typings.phaser.Phaser.Geom.Rectangle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Area")(rect.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Rounds a Rectangle's position up to the smallest integer greater than or equal to each current coordinate.
      * @param rect The Rectangle to adjust.
      */
    /* static member */
    inline def Ceil[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O): O = ^.asInstanceOf[js.Dynamic].applyDynamic("Ceil")(rect.asInstanceOf[js.Any]).asInstanceOf[O]
    
    /**
      * Rounds a Rectangle's position and size up to the smallest integer greater than or equal to each respective value.
      * @param rect The Rectangle to modify.
      */
    /* static member */
    inline def CeilAll[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O): O = ^.asInstanceOf[js.Dynamic].applyDynamic("CeilAll")(rect.asInstanceOf[js.Any]).asInstanceOf[O]
    
    /**
      * Moves the top-left corner of a Rectangle so that its center is at the given coordinates.
      * @param rect The Rectangle to be centered.
      * @param x The X coordinate of the Rectangle's center.
      * @param y The Y coordinate of the Rectangle's center.
      */
    /* static member */
    inline def CenterOn[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O, x: Double, y: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("CenterOn")(rect.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Creates a new Rectangle which is identical to the given one.
      * @param source The Rectangle to clone.
      */
    /* static member */
    inline def Clone(source: typings.phaser.Phaser.Geom.Rectangle): typings.phaser.Phaser.Geom.Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("Clone")(source.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.Phaser.Geom.Rectangle]
    
    /**
      * Checks if a given point is inside a Rectangle's bounds.
      * @param rect The Rectangle to check.
      * @param x The X coordinate of the point to check.
      * @param y The Y coordinate of the point to check.
      */
    /* static member */
    inline def Contains(rect: typings.phaser.Phaser.Geom.Rectangle, x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Contains")(rect.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Determines whether the specified point is contained within the rectangular region defined by this Rectangle object.
      * @param rect The Rectangle object.
      * @param point The point object to be checked. Can be a Phaser Point object or any object with x and y values.
      */
    /* static member */
    inline def ContainsPoint(rect: typings.phaser.Phaser.Geom.Rectangle, point: typings.phaser.Phaser.Geom.Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ContainsPoint")(rect.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Tests if one rectangle fully contains another.
      * @param rectA The first rectangle.
      * @param rectB The second rectangle.
      */
    /* static member */
    inline def ContainsRect(rectA: typings.phaser.Phaser.Geom.Rectangle, rectB: typings.phaser.Phaser.Geom.Rectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ContainsRect")(rectA.asInstanceOf[js.Any], rectB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Copy the values of one Rectangle to a destination Rectangle.
      * @param source The source Rectangle to copy the values from.
      * @param dest The destination Rectangle to copy the values to.
      */
    /* static member */
    inline def CopyFrom[O /* <: typings.phaser.Phaser.Geom.Rectangle */](source: typings.phaser.Phaser.Geom.Rectangle, dest: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("CopyFrom")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Create an array of points for each corner of a Rectangle
      * If an array is specified, each point object will be added to the end of the array, otherwise a new array will be created.
      * @param rect The Rectangle object to be decomposed.
      * @param out If provided, each point will be added to this array.
      */
    /* static member */
    inline def Decompose(rect: typings.phaser.Phaser.Geom.Rectangle): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Decompose")(rect.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    inline def Decompose(rect: typings.phaser.Phaser.Geom.Rectangle, out: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Decompose")(rect.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Compares the `x`, `y`, `width` and `height` properties of two rectangles.
      * @param rect Rectangle A
      * @param toCompare Rectangle B
      */
    /* static member */
    inline def Equals(rect: typings.phaser.Phaser.Geom.Rectangle, toCompare: typings.phaser.Phaser.Geom.Rectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Equals")(rect.asInstanceOf[js.Any], toCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Adjusts the target rectangle, changing its width, height and position,
      * so that it fits inside the area of the source rectangle, while maintaining its original
      * aspect ratio.
      * 
      * Unlike the `FitOutside` function, there may be some space inside the source area not covered.
      * @param target The target rectangle to adjust.
      * @param source The source rectangle to envelop the target in.
      */
    /* static member */
    inline def FitInside[O /* <: typings.phaser.Phaser.Geom.Rectangle */](target: O, source: typings.phaser.Phaser.Geom.Rectangle): O = (^.asInstanceOf[js.Dynamic].applyDynamic("FitInside")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Adjusts the target rectangle, changing its width, height and position,
      * so that it fully covers the area of the source rectangle, while maintaining its original
      * aspect ratio.
      * 
      * Unlike the `FitInside` function, the target rectangle may extend further out than the source.
      * @param target The target rectangle to adjust.
      * @param source The source rectangle to envelope the target in.
      */
    /* static member */
    inline def FitOutside[O /* <: typings.phaser.Phaser.Geom.Rectangle */](target: O, source: typings.phaser.Phaser.Geom.Rectangle): O = (^.asInstanceOf[js.Dynamic].applyDynamic("FitOutside")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Rounds down (floors) the top left X and Y coordinates of the given Rectangle to the largest integer less than or equal to them
      * @param rect The rectangle to floor the top left X and Y coordinates of
      */
    /* static member */
    inline def Floor[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O): O = ^.asInstanceOf[js.Dynamic].applyDynamic("Floor")(rect.asInstanceOf[js.Any]).asInstanceOf[O]
    
    /**
      * Rounds a Rectangle's position and size down to the largest integer less than or equal to each current coordinate or dimension.
      * @param rect The Rectangle to adjust.
      */
    /* static member */
    inline def FloorAll[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O): O = ^.asInstanceOf[js.Dynamic].applyDynamic("FloorAll")(rect.asInstanceOf[js.Any]).asInstanceOf[O]
    
    /**
      * Constructs new Rectangle or repositions and resizes an existing Rectangle so that all of the given points are on or within its bounds.
      * @param points An array of points (either arrays with two elements corresponding to the X and Y coordinate or an object with public `x` and `y` properties) which should be surrounded by the Rectangle.
      * @param out Optional Rectangle to adjust.
      */
    /* static member */
    inline def FromPoints[O /* <: typings.phaser.Phaser.Geom.Rectangle */](points: js.Array[Any]): O = ^.asInstanceOf[js.Dynamic].applyDynamic("FromPoints")(points.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def FromPoints[O /* <: typings.phaser.Phaser.Geom.Rectangle */](points: js.Array[Any], out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("FromPoints")(points.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Create the smallest Rectangle containing two coordinate pairs.
      * @param x1 The X coordinate of the first point.
      * @param y1 The Y coordinate of the first point.
      * @param x2 The X coordinate of the second point.
      * @param y2 The Y coordinate of the second point.
      * @param out Optional Rectangle to adjust.
      */
    /* static member */
    inline def FromXY[O /* <: typings.phaser.Phaser.Geom.Rectangle */](x1: Double, y1: Double, x2: Double, y2: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("FromXY")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def FromXY[O /* <: typings.phaser.Phaser.Geom.Rectangle */](x1: Double, y1: Double, x2: Double, y2: Double, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("FromXY")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Calculates the width/height ratio of a rectangle.
      * @param rect The rectangle.
      */
    /* static member */
    inline def GetAspectRatio(rect: typings.phaser.Phaser.Geom.Rectangle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAspectRatio")(rect.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns the center of a Rectangle as a Point.
      * @param rect The Rectangle to get the center of.
      * @param out Optional point-like object to update with the center coordinates.
      */
    /* static member */
    inline def GetCenter[O /* <: typings.phaser.Phaser.Geom.Point */](rect: typings.phaser.Phaser.Geom.Rectangle): O = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCenter")(rect.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def GetCenter[O /* <: typings.phaser.Phaser.Geom.Point */](rect: typings.phaser.Phaser.Geom.Rectangle, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCenter")(rect.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Calculates the coordinates of a point at a certain `position` on the Rectangle's perimeter.
      * 
      * The `position` is a fraction between 0 and 1 which defines how far into the perimeter the point is.
      * 
      * A value of 0 or 1 returns the point at the top left corner of the rectangle, while a value of 0.5 returns the point at the bottom right corner of the rectangle. Values between 0 and 0.5 are on the top or the right side and values between 0.5 and 1 are on the bottom or the left side.
      * @param rectangle The Rectangle to get the perimeter point from.
      * @param position The normalized distance into the Rectangle's perimeter to return.
      * @param out An object to update with the `x` and `y` coordinates of the point.
      */
    /* static member */
    inline def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](rectangle: typings.phaser.Phaser.Geom.Rectangle, position: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoint")(rectangle.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](rectangle: typings.phaser.Phaser.Geom.Rectangle, position: Double, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoint")(rectangle.asInstanceOf[js.Any], position.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Return an array of points from the perimeter of the rectangle, each spaced out based on the quantity or step required.
      * @param rectangle The Rectangle object to get the points from.
      * @param step Step between points. Used to calculate the number of points to return when quantity is falsey. Ignored if quantity is positive.
      * @param quantity The number of evenly spaced points from the rectangles perimeter to return. If falsey, step param will be used to calculate the number of points.
      * @param out An optional array to store the points in.
      */
    /* static member */
    inline def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](rectangle: typings.phaser.Phaser.Geom.Rectangle, step: Double, quantity: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(rectangle.asInstanceOf[js.Any], step.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](rectangle: typings.phaser.Phaser.Geom.Rectangle, step: Double, quantity: Double, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(rectangle.asInstanceOf[js.Any], step.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Returns the size of the Rectangle, expressed as a Point object.
      * With the value of the `width` as the `x` property and the `height` as the `y` property.
      * @param rect The Rectangle to get the size from.
      * @param out The Point object to store the size in. If not given, a new Point instance is created.
      */
    /* static member */
    inline def GetSize[O /* <: typings.phaser.Phaser.Geom.Point */](rect: typings.phaser.Phaser.Geom.Rectangle): O = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSize")(rect.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def GetSize[O /* <: typings.phaser.Phaser.Geom.Point */](rect: typings.phaser.Phaser.Geom.Rectangle, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetSize")(rect.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Increases the size of a Rectangle by a specified amount.
      * 
      * The center of the Rectangle stays the same. The amounts are added to each side, so the actual increase in width or height is two times bigger than the respective argument.
      * @param rect The Rectangle to inflate.
      * @param x How many pixels the left and the right side should be moved by horizontally.
      * @param y How many pixels the top and the bottom side should be moved by vertically.
      */
    /* static member */
    inline def Inflate[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O, x: Double, y: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Inflate")(rect.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Takes two Rectangles and first checks to see if they intersect.
      * If they intersect it will return the area of intersection in the `out` Rectangle.
      * If they do not intersect, the `out` Rectangle will have a width and height of zero.
      * @param rectA The first Rectangle to get the intersection from.
      * @param rectB The second Rectangle to get the intersection from.
      * @param out A Rectangle to store the intersection results in.
      */
    /* static member */
    inline def Intersection[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rectA: typings.phaser.Phaser.Geom.Rectangle, rectB: typings.phaser.Phaser.Geom.Rectangle): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Intersection")(rectA.asInstanceOf[js.Any], rectB.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def Intersection[O /* <: typings.phaser.Phaser.Geom.Rectangle */](
      rectA: typings.phaser.Phaser.Geom.Rectangle,
      rectB: typings.phaser.Phaser.Geom.Rectangle,
      out: typings.phaser.Phaser.Geom.Rectangle
    ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Intersection")(rectA.asInstanceOf[js.Any], rectB.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Returns an array of points from the perimeter of the Rectangle, where each point is spaced out based
      * on either the `step` value, or the `quantity`.
      * @param rect The Rectangle to get the perimeter points from.
      * @param step The distance between each point of the perimeter. Set to `null` if you wish to use the `quantity` parameter instead.
      * @param quantity The total number of points to return. The step is then calculated based on the length of the Rectangle, divided by this value.
      * @param out An array in which the perimeter points will be stored. If not given, a new array instance is created.
      */
    /* static member */
    inline def MarchingAnts[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](rect: typings.phaser.Phaser.Geom.Rectangle): O = ^.asInstanceOf[js.Dynamic].applyDynamic("MarchingAnts")(rect.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def MarchingAnts[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](rect: typings.phaser.Phaser.Geom.Rectangle, step: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("MarchingAnts")(rect.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def MarchingAnts[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](rect: typings.phaser.Phaser.Geom.Rectangle, step: Double, quantity: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("MarchingAnts")(rect.asInstanceOf[js.Any], step.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def MarchingAnts[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](rect: typings.phaser.Phaser.Geom.Rectangle, step: Double, quantity: Double, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("MarchingAnts")(rect.asInstanceOf[js.Any], step.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def MarchingAnts[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](rect: typings.phaser.Phaser.Geom.Rectangle, step: Double, quantity: Unit, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("MarchingAnts")(rect.asInstanceOf[js.Any], step.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def MarchingAnts[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](rect: typings.phaser.Phaser.Geom.Rectangle, step: Unit, quantity: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("MarchingAnts")(rect.asInstanceOf[js.Any], step.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def MarchingAnts[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](rect: typings.phaser.Phaser.Geom.Rectangle, step: Unit, quantity: Double, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("MarchingAnts")(rect.asInstanceOf[js.Any], step.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def MarchingAnts[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](rect: typings.phaser.Phaser.Geom.Rectangle, step: Unit, quantity: Unit, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("MarchingAnts")(rect.asInstanceOf[js.Any], step.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Merges a Rectangle with a list of points by repositioning and/or resizing it such that all points are located on or within its bounds.
      * @param target The Rectangle which should be merged.
      * @param points An array of Points (or any object with public `x` and `y` properties) which should be merged with the Rectangle.
      */
    /* static member */
    inline def MergePoints[O /* <: typings.phaser.Phaser.Geom.Rectangle */](target: O, points: js.Array[typings.phaser.Phaser.Geom.Point]): O = (^.asInstanceOf[js.Dynamic].applyDynamic("MergePoints")(target.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Merges the source rectangle into the target rectangle and returns the target.
      * Neither rectangle should have a negative width or height.
      * @param target Target rectangle. Will be modified to include source rectangle.
      * @param source Rectangle that will be merged into target rectangle.
      */
    /* static member */
    inline def MergeRect[O /* <: typings.phaser.Phaser.Geom.Rectangle */](target: O, source: typings.phaser.Phaser.Geom.Rectangle): O = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeRect")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Merges a Rectangle with a point by repositioning and/or resizing it so that the point is on or within its bounds.
      * @param target The Rectangle which should be merged and modified.
      * @param x The X coordinate of the point which should be merged.
      * @param y The Y coordinate of the point which should be merged.
      */
    /* static member */
    inline def MergeXY[O /* <: typings.phaser.Phaser.Geom.Rectangle */](target: O, x: Double, y: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeXY")(target.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Nudges (translates) the top left corner of a Rectangle by a given offset.
      * @param rect The Rectangle to adjust.
      * @param x The distance to move the Rectangle horizontally.
      * @param y The distance to move the Rectangle vertically.
      */
    /* static member */
    inline def Offset[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O, x: Double, y: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Offset")(rect.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Nudges (translates) the top-left corner of a Rectangle by the coordinates of a point (translation vector).
      * @param rect The Rectangle to adjust.
      * @param point The point whose coordinates should be used as an offset.
      */
    /* static member */
    inline def OffsetPoint[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O, point: typings.phaser.Phaser.Geom.Point): O = (^.asInstanceOf[js.Dynamic].applyDynamic("OffsetPoint")(rect.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def OffsetPoint[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O, point: Vector2): O = (^.asInstanceOf[js.Dynamic].applyDynamic("OffsetPoint")(rect.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Checks if two Rectangles overlap. If a Rectangle is within another Rectangle, the two will be considered overlapping. Thus, the Rectangles are treated as "solid".
      * @param rectA The first Rectangle to check.
      * @param rectB The second Rectangle to check.
      */
    /* static member */
    inline def Overlaps(rectA: typings.phaser.Phaser.Geom.Rectangle, rectB: typings.phaser.Phaser.Geom.Rectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Overlaps")(rectA.asInstanceOf[js.Any], rectB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Calculates the perimeter of a Rectangle.
      * @param rect The Rectangle to use.
      */
    /* static member */
    inline def Perimeter(rect: typings.phaser.Phaser.Geom.Rectangle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Perimeter")(rect.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns a Point from the perimeter of a Rectangle based on the given angle.
      * @param rectangle The Rectangle to get the perimeter point from.
      * @param angle The angle of the point, in degrees.
      * @param out The Point object to store the position in. If not given, a new Point instance is created.
      */
    /* static member */
    inline def PerimeterPoint[O /* <: typings.phaser.Phaser.Geom.Point */](rectangle: typings.phaser.Phaser.Geom.Rectangle, angle: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("PerimeterPoint")(rectangle.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def PerimeterPoint[O /* <: typings.phaser.Phaser.Geom.Point */](rectangle: typings.phaser.Phaser.Geom.Rectangle, angle: Double, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("PerimeterPoint")(rectangle.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Returns a random point within a Rectangle.
      * @param rect The Rectangle to return a point from.
      * @param out The object to update with the point's coordinates.
      */
    /* static member */
    inline def Random[O /* <: typings.phaser.Phaser.Geom.Point */](rect: typings.phaser.Phaser.Geom.Rectangle, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Random")(rect.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Calculates a random point that lies within the `outer` Rectangle, but outside of the `inner` Rectangle.
      * The inner Rectangle must be fully contained within the outer rectangle.
      * @param outer The outer Rectangle to get the random point within.
      * @param inner The inner Rectangle to exclude from the returned point.
      * @param out A Point, or Point-like object to store the result in. If not specified, a new Point will be created.
      */
    /* static member */
    inline def RandomOutside[O /* <: typings.phaser.Phaser.Geom.Point */](outer: typings.phaser.Phaser.Geom.Rectangle, inner: typings.phaser.Phaser.Geom.Rectangle): O = (^.asInstanceOf[js.Dynamic].applyDynamic("RandomOutside")(outer.asInstanceOf[js.Any], inner.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def RandomOutside[O /* <: typings.phaser.Phaser.Geom.Point */](outer: typings.phaser.Phaser.Geom.Rectangle, inner: typings.phaser.Phaser.Geom.Rectangle, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("RandomOutside")(outer.asInstanceOf[js.Any], inner.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Determines if the two objects (either Rectangles or Rectangle-like) have the same width and height values under strict equality.
      * @param rect The first Rectangle object.
      * @param toCompare The second Rectangle object.
      */
    /* static member */
    inline def SameDimensions(rect: typings.phaser.Phaser.Geom.Rectangle, toCompare: typings.phaser.Phaser.Geom.Rectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("SameDimensions")(rect.asInstanceOf[js.Any], toCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Scales the width and height of this Rectangle by the given amounts.
      * @param rect The `Rectangle` object that will be scaled by the specified amount(s).
      * @param x The factor by which to scale the rectangle horizontally.
      * @param y The amount by which to scale the rectangle vertically. If this is not specified, the rectangle will be scaled by the factor `x` in both directions.
      */
    /* static member */
    inline def Scale[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O, x: Double, y: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Scale")(rect.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Creates a new Rectangle or repositions and/or resizes an existing Rectangle so that it encompasses the two given Rectangles, i.e. calculates their union.
      * @param rectA The first Rectangle to use.
      * @param rectB The second Rectangle to use.
      * @param out The Rectangle to store the union in.
      */
    /* static member */
    inline def Union[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rectA: typings.phaser.Phaser.Geom.Rectangle, rectB: typings.phaser.Phaser.Geom.Rectangle): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Union")(rectA.asInstanceOf[js.Any], rectB.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def Union[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rectA: typings.phaser.Phaser.Geom.Rectangle, rectB: typings.phaser.Phaser.Geom.Rectangle, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Union")(rectA.asInstanceOf[js.Any], rectB.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
  }
  
  /**
    * A Triangle Geometry object type.
    */
  @JSImport("phaser", "Geom.TRIANGLE")
  @js.native
  def TRIANGLE_ : Double = js.native
  
  inline def TRIANGLE__=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRIANGLE")(x.asInstanceOf[js.Any])
  
  /**
    * A triangle is a plane created by connecting three points.
    * The first two arguments specify the first point, the middle two arguments
    * specify the second point, and the last two arguments specify the third point.
    */
  @JSImport("phaser", "Geom.Triangle")
  @js.native
  open class Triangle protected ()
    extends StObject
       with typings.phaser.Phaser.Geom.Triangle {
    /**
      * 
      * @param x1 `x` coordinate of the first point. Default 0.
      * @param y1 `y` coordinate of the first point. Default 0.
      * @param x2 `x` coordinate of the second point. Default 0.
      * @param y2 `y` coordinate of the second point. Default 0.
      * @param x3 `x` coordinate of the third point. Default 0.
      * @param y3 `y` coordinate of the third point. Default 0.
      */
    def this(
      x1: js.UndefOr[Double],
      y1: js.UndefOr[Double],
      x2: js.UndefOr[Double],
      y2: js.UndefOr[Double],
      x3: js.UndefOr[Double],
      y3: js.UndefOr[Double]
    ) = this()
  }
  object Triangle {
    
    @JSImport("phaser", "Geom.Triangle")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the area of a Triangle.
      * @param triangle The Triangle to use.
      */
    /* static member */
    inline def Area(triangle: typings.phaser.Phaser.Geom.Triangle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Area")(triangle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Builds an equilateral triangle. In the equilateral triangle, all the sides are the same length (congruent) and all the angles are the same size (congruent).
      * The x/y specifies the top-middle of the triangle (x1/y1) and length is the length of each side.
      * @param x x coordinate of the top point of the triangle.
      * @param y y coordinate of the top point of the triangle.
      * @param length Length of each side of the triangle.
      */
    /* static member */
    inline def BuildEquilateral(x: Double, y: Double, length: Double): typings.phaser.Phaser.Geom.Triangle = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildEquilateral")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Geom.Triangle]
    
    /**
      * Takes an array of vertex coordinates, and optionally an array of hole indices, then returns an array
      * of Triangle instances, where the given vertices have been decomposed into a series of triangles.
      * @param data A flat array of vertex coordinates like [x0,y0, x1,y1, x2,y2, ...]
      * @param holes An array of hole indices if any (e.g. [5, 8] for a 12-vertex input would mean one hole with vertices 5–7 and another with 8–11). Default null.
      * @param scaleX Horizontal scale factor to multiply the resulting points by. Default 1.
      * @param scaleY Vertical scale factor to multiply the resulting points by. Default 1.
      * @param out An array to store the resulting Triangle instances in. If not provided, a new array is created.
      */
    /* static member */
    inline def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[Any]): O = ^.asInstanceOf[js.Dynamic].applyDynamic("BuildFromPolygon")(data.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[Any], holes: js.Array[Any]): O = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildFromPolygon")(data.asInstanceOf[js.Any], holes.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[Any], holes: js.Array[Any], scaleX: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildFromPolygon")(data.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[Any], holes: js.Array[Any], scaleX: Double, scaleY: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildFromPolygon")(data.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[Any], holes: js.Array[Any], scaleX: Double, scaleY: Double, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildFromPolygon")(data.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[Any], holes: js.Array[Any], scaleX: Double, scaleY: Unit, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildFromPolygon")(data.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[Any], holes: js.Array[Any], scaleX: Unit, scaleY: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildFromPolygon")(data.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[Any], holes: js.Array[Any], scaleX: Unit, scaleY: Double, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildFromPolygon")(data.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[Any], holes: js.Array[Any], scaleX: Unit, scaleY: Unit, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildFromPolygon")(data.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[Any], holes: Unit, scaleX: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildFromPolygon")(data.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[Any], holes: Unit, scaleX: Double, scaleY: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildFromPolygon")(data.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[Any], holes: Unit, scaleX: Double, scaleY: Double, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildFromPolygon")(data.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[Any], holes: Unit, scaleX: Double, scaleY: Unit, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildFromPolygon")(data.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[Any], holes: Unit, scaleX: Unit, scaleY: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildFromPolygon")(data.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[Any], holes: Unit, scaleX: Unit, scaleY: Double, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildFromPolygon")(data.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[Any], holes: Unit, scaleX: Unit, scaleY: Unit, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildFromPolygon")(data.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Builds a right triangle, i.e. one which has a 90-degree angle and two acute angles.
      * @param x The X coordinate of the right angle, which will also be the first X coordinate of the constructed Triangle.
      * @param y The Y coordinate of the right angle, which will also be the first Y coordinate of the constructed Triangle.
      * @param width The length of the side which is to the left or to the right of the right angle.
      * @param height The length of the side which is above or below the right angle.
      */
    /* static member */
    inline def BuildRight(x: Double, y: Double, width: Double, height: Double): typings.phaser.Phaser.Geom.Triangle = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildRight")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Geom.Triangle]
    
    /**
      * Positions the Triangle so that it is centered on the given coordinates.
      * @param triangle The triangle to be positioned.
      * @param x The horizontal coordinate to center on.
      * @param y The vertical coordinate to center on.
      * @param centerFunc The function used to center the triangle. Defaults to Centroid centering.
      */
    /* static member */
    inline def CenterOn[O /* <: typings.phaser.Phaser.Geom.Triangle */](triangle: O, x: Double, y: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("CenterOn")(triangle.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def CenterOn[O /* <: typings.phaser.Phaser.Geom.Triangle */](triangle: O, x: Double, y: Double, centerFunc: CenterFunction): O = (^.asInstanceOf[js.Dynamic].applyDynamic("CenterOn")(triangle.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], centerFunc.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Calculates the position of a Triangle's centroid, which is also its center of mass (center of gravity).
      * 
      * The centroid is the point in a Triangle at which its three medians (the lines drawn from the vertices to the bisectors of the opposite sides) meet. It divides each one in a 2:1 ratio.
      * @param triangle The Triangle to use.
      * @param out An object to store the coordinates in.
      */
    /* static member */
    inline def Centroid[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle): O = ^.asInstanceOf[js.Dynamic].applyDynamic("Centroid")(triangle.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def Centroid[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Centroid")(triangle.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Computes the circumcentre of a triangle. The circumcentre is the centre of
      * the circumcircle, the smallest circle which encloses the triangle. It is also
      * the common intersection point of the perpendicular bisectors of the sides of
      * the triangle, and is the only point which has equal distance to all three
      * vertices of the triangle.
      * @param triangle The Triangle to get the circumcenter of.
      * @param out The Vector2 object to store the position in. If not given, a new Vector2 instance is created.
      */
    /* static member */
    inline def CircumCenter[O /* <: Vector2 */](triangle: typings.phaser.Phaser.Geom.Triangle): O = ^.asInstanceOf[js.Dynamic].applyDynamic("CircumCenter")(triangle.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def CircumCenter[O /* <: Vector2 */](triangle: typings.phaser.Phaser.Geom.Triangle, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("CircumCenter")(triangle.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Finds the circumscribed circle (circumcircle) of a Triangle object. The circumcircle is the circle which touches all of the triangle's vertices.
      * @param triangle The Triangle to use as input.
      * @param out An optional Circle to store the result in.
      */
    /* static member */
    inline def CircumCircle[O /* <: typings.phaser.Phaser.Geom.Circle */](triangle: typings.phaser.Phaser.Geom.Triangle): O = ^.asInstanceOf[js.Dynamic].applyDynamic("CircumCircle")(triangle.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def CircumCircle[O /* <: typings.phaser.Phaser.Geom.Circle */](triangle: typings.phaser.Phaser.Geom.Triangle, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("CircumCircle")(triangle.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Clones a Triangle object.
      * @param source The Triangle to clone.
      */
    /* static member */
    inline def Clone(source: typings.phaser.Phaser.Geom.Triangle): typings.phaser.Phaser.Geom.Triangle = ^.asInstanceOf[js.Dynamic].applyDynamic("Clone")(source.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.Phaser.Geom.Triangle]
    
    /**
      * Checks if a point (as a pair of coordinates) is inside a Triangle's bounds.
      * @param triangle The Triangle to check.
      * @param x The X coordinate of the point to check.
      * @param y The Y coordinate of the point to check.
      */
    /* static member */
    inline def Contains(triangle: typings.phaser.Phaser.Geom.Triangle, x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Contains")(triangle.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Filters an array of point-like objects to only those contained within a triangle.
      * If `returnFirst` is true, will return an array containing only the first point in the provided array that is within the triangle (or an empty array if there are no such points).
      * @param triangle The triangle that the points are being checked in.
      * @param points An array of point-like objects (objects that have an `x` and `y` property)
      * @param returnFirst If `true`, return an array containing only the first point found that is within the triangle. Default false.
      * @param out If provided, the points that are within the triangle will be appended to this array instead of being added to a new array. If `returnFirst` is true, only the first point found within the triangle will be appended. This array will also be returned by this function.
      */
    /* static member */
    inline def ContainsArray(triangle: typings.phaser.Phaser.Geom.Triangle, points: js.Array[typings.phaser.Phaser.Geom.Point]): js.Array[typings.phaser.Phaser.Geom.Point] = (^.asInstanceOf[js.Dynamic].applyDynamic("ContainsArray")(triangle.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Geom.Point]]
    inline def ContainsArray(
      triangle: typings.phaser.Phaser.Geom.Triangle,
      points: js.Array[typings.phaser.Phaser.Geom.Point],
      returnFirst: Boolean
    ): js.Array[typings.phaser.Phaser.Geom.Point] = (^.asInstanceOf[js.Dynamic].applyDynamic("ContainsArray")(triangle.asInstanceOf[js.Any], points.asInstanceOf[js.Any], returnFirst.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Geom.Point]]
    inline def ContainsArray(
      triangle: typings.phaser.Phaser.Geom.Triangle,
      points: js.Array[typings.phaser.Phaser.Geom.Point],
      returnFirst: Boolean,
      out: js.Array[Any]
    ): js.Array[typings.phaser.Phaser.Geom.Point] = (^.asInstanceOf[js.Dynamic].applyDynamic("ContainsArray")(triangle.asInstanceOf[js.Any], points.asInstanceOf[js.Any], returnFirst.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Geom.Point]]
    inline def ContainsArray(
      triangle: typings.phaser.Phaser.Geom.Triangle,
      points: js.Array[typings.phaser.Phaser.Geom.Point],
      returnFirst: Unit,
      out: js.Array[Any]
    ): js.Array[typings.phaser.Phaser.Geom.Point] = (^.asInstanceOf[js.Dynamic].applyDynamic("ContainsArray")(triangle.asInstanceOf[js.Any], points.asInstanceOf[js.Any], returnFirst.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Geom.Point]]
    
    inline def ContainsPoint(triangle: typings.phaser.Phaser.Geom.Triangle, point: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ContainsPoint")(triangle.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    /**
      * Tests if a triangle contains a point.
      * @param triangle The triangle.
      * @param point The point to test, or any point-like object with public `x` and `y` properties.
      */
    /* static member */
    inline def ContainsPoint(triangle: typings.phaser.Phaser.Geom.Triangle, point: typings.phaser.Phaser.Geom.Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ContainsPoint")(triangle.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def ContainsPoint(triangle: typings.phaser.Phaser.Geom.Triangle, point: Vector2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ContainsPoint")(triangle.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Copy the values of one Triangle to a destination Triangle.
      * @param source The source Triangle to copy the values from.
      * @param dest The destination Triangle to copy the values to.
      */
    /* static member */
    inline def CopyFrom[O /* <: typings.phaser.Phaser.Geom.Triangle */](source: typings.phaser.Phaser.Geom.Triangle, dest: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("CopyFrom")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Decomposes a Triangle into an array of its points.
      * @param triangle The Triangle to decompose.
      * @param out An array to store the points into.
      */
    /* static member */
    inline def Decompose(triangle: typings.phaser.Phaser.Geom.Triangle): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Decompose")(triangle.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    inline def Decompose(triangle: typings.phaser.Phaser.Geom.Triangle, out: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Decompose")(triangle.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Returns true if two triangles have the same coordinates.
      * @param triangle The first triangle to check.
      * @param toCompare The second triangle to check.
      */
    /* static member */
    inline def Equals(triangle: typings.phaser.Phaser.Geom.Triangle, toCompare: typings.phaser.Phaser.Geom.Triangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Equals")(triangle.asInstanceOf[js.Any], toCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns a Point from around the perimeter of a Triangle.
      * @param triangle The Triangle to get the point on its perimeter from.
      * @param position The position along the perimeter of the triangle. A value between 0 and 1.
      * @param out An option Point, or Point-like object to store the value in. If not given a new Point will be created.
      */
    /* static member */
    inline def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle, position: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoint")(triangle.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle, position: Double, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoint")(triangle.asInstanceOf[js.Any], position.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Returns an array of evenly spaced points on the perimeter of a Triangle.
      * @param triangle The Triangle to get the points from.
      * @param quantity The number of evenly spaced points to return. Set to 0 to return an arbitrary number of points based on the `stepRate`.
      * @param stepRate If `quantity` is 0, the distance between each returned point.
      * @param out An array to which the points should be appended.
      */
    /* static member */
    inline def GetPoints[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle, quantity: Double, stepRate: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(triangle.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], stepRate.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def GetPoints[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle, quantity: Double, stepRate: Double, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPoints")(triangle.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], stepRate.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Calculates the position of the incenter of a Triangle object. This is the point where its three angle bisectors meet and it's also the center of the incircle, which is the circle inscribed in the triangle.
      * @param triangle The Triangle to find the incenter of.
      * @param out An optional Point in which to store the coordinates.
      */
    /* static member */
    inline def InCenter[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle): O = ^.asInstanceOf[js.Dynamic].applyDynamic("InCenter")(triangle.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def InCenter[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("InCenter")(triangle.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Moves each point (vertex) of a Triangle by a given offset, thus moving the entire Triangle by that offset.
      * @param triangle The Triangle to move.
      * @param x The horizontal offset (distance) by which to move each point. Can be positive or negative.
      * @param y The vertical offset (distance) by which to move each point. Can be positive or negative.
      */
    /* static member */
    inline def Offset[O /* <: typings.phaser.Phaser.Geom.Triangle */](triangle: O, x: Double, y: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Offset")(triangle.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Gets the length of the perimeter of the given triangle.
      * Calculated by adding together the length of each of the three sides.
      * @param triangle The Triangle to get the length from.
      */
    /* static member */
    inline def Perimeter(triangle: typings.phaser.Phaser.Geom.Triangle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Perimeter")(triangle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns a random Point from within the area of the given Triangle.
      * @param triangle The Triangle to get a random point from.
      * @param out The Point object to store the position in. If not given, a new Point instance is created.
      */
    /* static member */
    inline def Random[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle): O = ^.asInstanceOf[js.Dynamic].applyDynamic("Random")(triangle.asInstanceOf[js.Any]).asInstanceOf[O]
    inline def Random[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle, out: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Random")(triangle.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Rotates a Triangle about its incenter, which is the point at which its three angle bisectors meet.
      * @param triangle The Triangle to rotate.
      * @param angle The angle by which to rotate the Triangle, in radians.
      */
    /* static member */
    inline def Rotate[O /* <: typings.phaser.Phaser.Geom.Triangle */](triangle: O, angle: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("Rotate")(triangle.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Rotates a Triangle at a certain angle about a given Point or object with public `x` and `y` properties.
      * @param triangle The Triangle to rotate.
      * @param point The Point to rotate the Triangle about.
      * @param angle The angle by which to rotate the Triangle, in radians.
      */
    /* static member */
    inline def RotateAroundPoint[O /* <: typings.phaser.Phaser.Geom.Triangle */](triangle: O, point: typings.phaser.Phaser.Geom.Point, angle: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateAroundPoint")(triangle.asInstanceOf[js.Any], point.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[O]
    
    /**
      * Rotates an entire Triangle at a given angle about a specific point.
      * @param triangle The Triangle to rotate.
      * @param x The X coordinate of the point to rotate the Triangle about.
      * @param y The Y coordinate of the point to rotate the Triangle about.
      * @param angle The angle by which to rotate the Triangle, in radians.
      */
    /* static member */
    inline def RotateAroundXY[O /* <: typings.phaser.Phaser.Geom.Triangle */](triangle: O, x: Double, y: Double, angle: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateAroundXY")(triangle.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[O]
  }
}
