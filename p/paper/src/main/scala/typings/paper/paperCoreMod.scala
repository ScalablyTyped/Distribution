package typings.paper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import typings.paper.anon.TypeofColor
import typings.paper.anon.TypeofKey
import typings.paper.anon.TypeofPaperScope
import typings.paper.anon.TypeofPath
import typings.paper.anon.TypeofPathItem
import typings.paper.anon.TypeofPoint
import typings.paper.anon.TypeofShape
import typings.paper.anon.TypeofSize
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<paper.paper.PaperScope, std.Exclude<keyof paper.paper.PaperScope, 'PaperScript'>> */
object paperCoreMod {
  
  @JSImport("paper/dist/paper-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Color")
  @js.native
  class Color protected ()
    extends typings.paper.paper.Color {
    /** 
      * Creates a RGB Color object.
      * 
      * @param red - the amount of red in the color as a value between
      *     `0` and `1`
      * @param green - the amount of green in the color as a value
      *     between `0` and `1`
      * @param blue - the amount of blue in the color as a value
      *     between `0` and `1`
      * @param alpha - the alpha of the color as a value between `0`
      *     and `1`
      */
    def this(red: Double, green: Double, blue: Double) = this()
    def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
  }
  @JSImport("paper/dist/paper-core", "Color")
  @js.native
  def Color: TypeofColor with (Instantiable4[
    /* red */ Double, 
    /* green */ Double, 
    /* blue */ Double, 
    /* alpha */ js.UndefOr[Double], 
    typings.paper.paper.Color
  ]) = js.native
  @scala.inline
  def Color_=(
    x: TypeofColor with (Instantiable4[
      /* red */ Double, 
      /* green */ Double, 
      /* blue */ Double, 
      /* alpha */ js.UndefOr[Double], 
      typings.paper.paper.Color
    ])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Color")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "CompoundPath")
  @js.native
  class CompoundPath protected ()
    extends typings.paper.paper.CompoundPath {
    /** 
      * Creates a new compound path item from SVG path-data and places it at the
      * top of the active layer.
      * 
      * @param pathData - the SVG path-data that describes the geometry
      * of this path
      */
    def this(pathData: String) = this()
  }
  @JSImport("paper/dist/paper-core", "CompoundPath")
  @js.native
  def CompoundPath: Instantiable1[/* pathData */ String, typings.paper.paper.CompoundPath] = js.native
  @scala.inline
  def CompoundPath_=(x: Instantiable1[/* pathData */ String, typings.paper.paper.CompoundPath]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CompoundPath")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Curve")
  @js.native
  class Curve protected ()
    extends typings.paper.paper.Curve {
    /** 
      * Creates a new curve object.
      */
    def this(segment1: typings.paper.paper.Segment, segment2: typings.paper.paper.Segment) = this()
  }
  @JSImport("paper/dist/paper-core", "Curve")
  @js.native
  def Curve: Instantiable2[
    /* segment1 */ typings.paper.paper.Segment, 
    /* segment2 */ typings.paper.paper.Segment, 
    typings.paper.paper.Curve
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "CurveLocation")
  @js.native
  class CurveLocation protected ()
    extends typings.paper.paper.CurveLocation {
    /** 
      * Creates a new CurveLocation object.
      */
    def this(curve: typings.paper.paper.Curve, time: Double) = this()
    def this(curve: typings.paper.paper.Curve, time: Double, point: typings.paper.paper.Point) = this()
  }
  @JSImport("paper/dist/paper-core", "CurveLocation")
  @js.native
  def CurveLocation: Instantiable3[
    /* curve */ typings.paper.paper.Curve, 
    /* time */ Double, 
    /* point */ js.UndefOr[typings.paper.paper.Point], 
    typings.paper.paper.CurveLocation
  ] = js.native
  @scala.inline
  def CurveLocation_=(
    x: Instantiable3[
      /* curve */ typings.paper.paper.Curve, 
      /* time */ Double, 
      /* point */ js.UndefOr[typings.paper.paper.Point], 
      typings.paper.paper.CurveLocation
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CurveLocation")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Curve_=(
    x: Instantiable2[
      /* segment1 */ typings.paper.paper.Segment, 
      /* segment2 */ typings.paper.paper.Segment, 
      typings.paper.paper.Curve
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Curve")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Event")
  @js.native
  class Event ()
    extends typings.paper.paper.Event
  @JSImport("paper/dist/paper-core", "Event")
  @js.native
  def Event: Instantiable0[typings.paper.paper.Event] = js.native
  @scala.inline
  def Event_=(x: Instantiable0[typings.paper.paper.Event]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Event")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Gradient")
  @js.native
  class Gradient ()
    extends typings.paper.paper.Gradient
  @JSImport("paper/dist/paper-core", "Gradient")
  @js.native
  def Gradient: Instantiable0[typings.paper.paper.Gradient] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "GradientStop")
  @js.native
  /** 
    * Creates a GradientStop object.
    * 
    * @param color - the color of the stop
    * @param offset - the position of the stop on the gradient
    * ramp as a value between `0` and `1`; `null` or `undefined` for automatic
    * assignment.
    */
  class GradientStop ()
    extends typings.paper.paper.GradientStop {
    def this(color: typings.paper.paper.Color) = this()
    def this(color: js.UndefOr[scala.Nothing], offset: Double) = this()
    def this(color: typings.paper.paper.Color, offset: Double) = this()
  }
  @JSImport("paper/dist/paper-core", "GradientStop")
  @js.native
  def GradientStop: Instantiable2[
    /* color */ js.UndefOr[typings.paper.paper.Color], 
    /* offset */ js.UndefOr[Double], 
    typings.paper.paper.GradientStop
  ] = js.native
  @scala.inline
  def GradientStop_=(
    x: Instantiable2[
      /* color */ js.UndefOr[typings.paper.paper.Color], 
      /* offset */ js.UndefOr[Double], 
      typings.paper.paper.GradientStop
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GradientStop")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Gradient_=(x: Instantiable0[typings.paper.paper.Gradient]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Gradient")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Group")
  @js.native
  /** 
    * Creates a new Group item and places it at the top of the active layer.
    * 
    * @param children - An array of children that will be added to the
    * newly created group
    */
  class Group ()
    extends typings.paper.paper.Group {
    def this(children: js.Array[typings.paper.paper.Item]) = this()
  }
  @JSImport("paper/dist/paper-core", "Group")
  @js.native
  def Group: Instantiable1[
    /* children */ js.UndefOr[js.Array[typings.paper.paper.Item]], 
    typings.paper.paper.Group
  ] = js.native
  @scala.inline
  def Group_=(
    x: Instantiable1[
      /* children */ js.UndefOr[js.Array[typings.paper.paper.Item]], 
      typings.paper.paper.Group
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "HitResult")
  @js.native
  class HitResult ()
    extends typings.paper.paper.HitResult
  @JSImport("paper/dist/paper-core", "HitResult")
  @js.native
  def HitResult: Instantiable0[typings.paper.paper.HitResult] = js.native
  @scala.inline
  def HitResult_=(x: Instantiable0[typings.paper.paper.HitResult]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HitResult")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Item")
  @js.native
  class Item ()
    extends typings.paper.paper.Item
  @JSImport("paper/dist/paper-core", "Item")
  @js.native
  def Item: Instantiable0[typings.paper.paper.Item] = js.native
  @scala.inline
  def Item_=(x: Instantiable0[typings.paper.paper.Item]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Key")
  @js.native
  class Key ()
    extends typings.paper.paper.Key
  @JSImport("paper/dist/paper-core", "Key")
  @js.native
  def Key: TypeofKey with Instantiable0[typings.paper.paper.Key] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "KeyEvent")
  @js.native
  class KeyEvent ()
    extends typings.paper.paper.KeyEvent
  @JSImport("paper/dist/paper-core", "KeyEvent")
  @js.native
  def KeyEvent: Instantiable0[typings.paper.paper.KeyEvent] = js.native
  @scala.inline
  def KeyEvent_=(x: Instantiable0[typings.paper.paper.KeyEvent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KeyEvent")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Key_=(x: TypeofKey with Instantiable0[typings.paper.paper.Key]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Key")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Layer")
  @js.native
  /** 
    * Creates a new Layer item and places it at the end of the
    * {@link Project#layers} array. The newly created layer will be activated,
    * so all newly created items will be placed within it.
    * 
    * @param children - An array of items that will be added to the
    * newly created layer
    */
  class Layer ()
    extends typings.paper.paper.Layer {
    def this(children: js.Array[typings.paper.paper.Item]) = this()
  }
  @JSImport("paper/dist/paper-core", "Layer")
  @js.native
  def Layer: Instantiable1[
    /* children */ js.UndefOr[js.Array[typings.paper.paper.Item]], 
    typings.paper.paper.Layer
  ] = js.native
  @scala.inline
  def Layer_=(
    x: Instantiable1[
      /* children */ js.UndefOr[js.Array[typings.paper.paper.Item]], 
      typings.paper.paper.Layer
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layer")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Matrix")
  @js.native
  /** 
    * Creates a 2D affine transformation matrix that describes the identity
    * transformation.
    */
  class Matrix ()
    extends typings.paper.paper.Matrix
  @JSImport("paper/dist/paper-core", "Matrix")
  @js.native
  def Matrix: Instantiable0[typings.paper.paper.Matrix] = js.native
  @scala.inline
  def Matrix_=(x: Instantiable0[typings.paper.paper.Matrix]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Matrix")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "MouseEvent")
  @js.native
  class MouseEvent ()
    extends typings.paper.paper.MouseEvent
  @JSImport("paper/dist/paper-core", "MouseEvent")
  @js.native
  def MouseEvent: Instantiable0[typings.paper.paper.MouseEvent] = js.native
  @scala.inline
  def MouseEvent_=(x: Instantiable0[typings.paper.paper.MouseEvent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MouseEvent")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "PaperScope")
  @js.native
  /** 
    * Creates a PaperScope object.
    */
  class PaperScope ()
    extends typings.paper.paper.PaperScope
  @JSImport("paper/dist/paper-core", "PaperScope")
  @js.native
  def PaperScope: TypeofPaperScope with Instantiable0[typings.paper.paper.PaperScope] = js.native
  @scala.inline
  def PaperScope_=(x: TypeofPaperScope with Instantiable0[typings.paper.paper.PaperScope]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PaperScope")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Path")
  @js.native
  /** 
    * Creates a new path item and places it at the top of the active layer.
    * 
    * @param segments - An array of segments (or points to be
    * converted to segments) that will be added to the path
    */
  class Path ()
    extends typings.paper.paper.Path {
    def this(segments: js.Array[typings.paper.paper.Segment]) = this()
  }
  @JSImport("paper/dist/paper-core", "Path")
  @js.native
  def Path: TypeofPath with (Instantiable1[
    /* segments */ js.UndefOr[js.Array[typings.paper.paper.Segment]], 
    typings.paper.paper.Path
  ]) = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "PathItem")
  @js.native
  class PathItem ()
    extends typings.paper.paper.PathItem
  @JSImport("paper/dist/paper-core", "PathItem")
  @js.native
  def PathItem: TypeofPathItem with Instantiable0[typings.paper.paper.PathItem] = js.native
  @scala.inline
  def PathItem_=(x: TypeofPathItem with Instantiable0[typings.paper.paper.PathItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PathItem")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Path_=(
    x: TypeofPath with (Instantiable1[
      /* segments */ js.UndefOr[js.Array[typings.paper.paper.Segment]], 
      typings.paper.paper.Path
    ])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Point")
  @js.native
  class Point protected ()
    extends typings.paper.paper.Point {
    /** 
      * Creates a Point object with the given x and y coordinates.
      * 
      * @param x - the x coordinate
      * @param y - the y coordinate
      */
    def this(x: Double, y: Double) = this()
  }
  @JSImport("paper/dist/paper-core", "Point")
  @js.native
  def Point: TypeofPoint with (Instantiable2[/* x */ Double, /* y */ Double, typings.paper.paper.Point]) = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "PointText")
  @js.native
  class PointText protected ()
    extends typings.paper.paper.PointText {
    /** 
      * Creates a point text item
      * 
      * @param point - the position where the text will start
      */
    def this(point: typings.paper.paper.Point) = this()
  }
  @JSImport("paper/dist/paper-core", "PointText")
  @js.native
  def PointText: Instantiable1[/* point */ typings.paper.paper.Point, typings.paper.paper.PointText] = js.native
  @scala.inline
  def PointText_=(x: Instantiable1[/* point */ typings.paper.paper.Point, typings.paper.paper.PointText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PointText")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Point_=(x: TypeofPoint with (Instantiable2[/* x */ Double, /* y */ Double, typings.paper.paper.Point])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Point")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Project")
  @js.native
  class Project protected ()
    extends typings.paper.paper.Project {
    def this(element: String) = this()
    def this(element: typings.paper.paper.Size) = this()
    /** 
      * Creates a Paper.js project containing one empty {@link Layer}, referenced
      * by {@link Project#activeLayer}.
      * 
      * Note that when working with PaperScript, a project is automatically
      * created for us and the {@link PaperScope#project} variable points to it.
      * 
      * @param element - the HTML canvas element
      * that should be used as the element for the view, or an ID string by which
      * to find the element, or the size of the canvas to be created for usage in
      * a web worker.
      */
    def this(element: HTMLCanvasElement) = this()
  }
  @JSImport("paper/dist/paper-core", "Project")
  @js.native
  def Project_ : Instantiable1[
    /* element */ HTMLCanvasElement | String | typings.paper.paper.Size, 
    typings.paper.paper.Project
  ] = js.native
  
  @scala.inline
  def Project__=(
    x: Instantiable1[
      /* element */ HTMLCanvasElement | String | typings.paper.paper.Size, 
      typings.paper.paper.Project
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Project")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Raster")
  @js.native
  /** 
    * Creates a new raster item from the passed argument, and places it in the
    * active layer. `source` can either be a DOM Image, a Canvas, or a string
    * describing the URL to load the image from, or the ID of a DOM element to
    * get the image from (either a DOM Image or a Canvas).
    * 
    * @param source - the source of
    *     the raster
    * @param position - the center position at which the raster item is
    *     placed
    */
  class Raster ()
    extends typings.paper.paper.Raster {
    def this(source: String) = this()
    def this(source: HTMLCanvasElement) = this()
    def this(source: HTMLImageElement) = this()
    def this(source: js.UndefOr[scala.Nothing], position: typings.paper.paper.Point) = this()
    def this(source: String, position: typings.paper.paper.Point) = this()
    def this(source: HTMLCanvasElement, position: typings.paper.paper.Point) = this()
    def this(source: HTMLImageElement, position: typings.paper.paper.Point) = this()
  }
  @JSImport("paper/dist/paper-core", "Raster")
  @js.native
  def Raster: Instantiable2[
    /* source */ js.UndefOr[HTMLImageElement | HTMLCanvasElement | String], 
    /* position */ js.UndefOr[typings.paper.paper.Point], 
    typings.paper.paper.Raster
  ] = js.native
  @scala.inline
  def Raster_=(
    x: Instantiable2[
      /* source */ js.UndefOr[HTMLImageElement | HTMLCanvasElement | String], 
      /* position */ js.UndefOr[typings.paper.paper.Point], 
      typings.paper.paper.Raster
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Raster")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Rectangle")
  @js.native
  class Rectangle protected ()
    extends typings.paper.paper.Rectangle {
    /** 
      * Creates a Rectangle object.
      * 
      * @param point - the top-left point of the rectangle
      * @param size - the size of the rectangle
      */
    def this(point: typings.paper.paper.Point, size: typings.paper.paper.Size) = this()
  }
  @JSImport("paper/dist/paper-core", "Rectangle")
  @js.native
  def Rectangle: Instantiable2[
    /* point */ typings.paper.paper.Point, 
    /* size */ typings.paper.paper.Size, 
    typings.paper.paper.Rectangle
  ] = js.native
  @scala.inline
  def Rectangle_=(
    x: Instantiable2[
      /* point */ typings.paper.paper.Point, 
      /* size */ typings.paper.paper.Size, 
      typings.paper.paper.Rectangle
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rectangle")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Segment")
  @js.native
  /** 
    * Creates a new Segment object.
    * 
    * @param point - the anchor point of the segment
    * @param handleIn - the handle point relative to the
    *     anchor point of the segment that describes the in tangent of the
    *     segment
    * @param handleOut - the handle point relative to the
    *     anchor point of the segment that describes the out tangent of the
    *     segment
    */
  class Segment ()
    extends typings.paper.paper.Segment {
    def this(point: typings.paper.paper.Point) = this()
    def this(point: js.UndefOr[scala.Nothing], handleIn: typings.paper.paper.Point) = this()
    def this(point: typings.paper.paper.Point, handleIn: typings.paper.paper.Point) = this()
    def this(
      point: js.UndefOr[scala.Nothing],
      handleIn: js.UndefOr[scala.Nothing],
      handleOut: typings.paper.paper.Point
    ) = this()
    def this(
      point: js.UndefOr[scala.Nothing],
      handleIn: typings.paper.paper.Point,
      handleOut: typings.paper.paper.Point
    ) = this()
    def this(
      point: typings.paper.paper.Point,
      handleIn: js.UndefOr[scala.Nothing],
      handleOut: typings.paper.paper.Point
    ) = this()
    def this(
      point: typings.paper.paper.Point,
      handleIn: typings.paper.paper.Point,
      handleOut: typings.paper.paper.Point
    ) = this()
  }
  @JSImport("paper/dist/paper-core", "Segment")
  @js.native
  def Segment: Instantiable3[
    /* point */ js.UndefOr[typings.paper.paper.Point], 
    /* handleIn */ js.UndefOr[typings.paper.paper.Point], 
    /* handleOut */ js.UndefOr[typings.paper.paper.Point], 
    typings.paper.paper.Segment
  ] = js.native
  @scala.inline
  def Segment_=(
    x: Instantiable3[
      /* point */ js.UndefOr[typings.paper.paper.Point], 
      /* handleIn */ js.UndefOr[typings.paper.paper.Point], 
      /* handleOut */ js.UndefOr[typings.paper.paper.Point], 
      typings.paper.paper.Segment
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Segment")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Shape")
  @js.native
  class Shape ()
    extends typings.paper.paper.Shape
  @JSImport("paper/dist/paper-core", "Shape")
  @js.native
  def Shape: TypeofShape with Instantiable0[typings.paper.paper.Shape] = js.native
  @scala.inline
  def Shape_=(x: TypeofShape with Instantiable0[typings.paper.paper.Shape]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Shape")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Size")
  @js.native
  class Size protected ()
    extends typings.paper.paper.Size {
    /** 
      * Creates a Size object with the given width and height values.
      * 
      * @param width - the width
      * @param height - the height
      */
    def this(width: Double, height: Double) = this()
  }
  @JSImport("paper/dist/paper-core", "Size")
  @js.native
  def Size: TypeofSize with (Instantiable2[/* width */ Double, /* height */ Double, typings.paper.paper.Size]) = js.native
  @scala.inline
  def Size_=(
    x: TypeofSize with (Instantiable2[/* width */ Double, /* height */ Double, typings.paper.paper.Size])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Size")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Style")
  @js.native
  class Style protected ()
    extends typings.paper.paper.Style {
    /** 
      * Style objects don't need to be created directly. Just pass an object to
      * {@link Item#style} or {@link Project#currentStyle}, it will be converted
      * to a Style object internally.
      */
    def this(style: js.Object) = this()
  }
  @JSImport("paper/dist/paper-core", "Style")
  @js.native
  def Style: Instantiable1[/* style */ js.Object, typings.paper.paper.Style] = js.native
  @scala.inline
  def Style_=(x: Instantiable1[/* style */ js.Object, typings.paper.paper.Style]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Style")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "SymbolDefinition")
  @js.native
  class SymbolDefinition protected ()
    extends typings.paper.paper.SymbolDefinition {
    /** 
      * Creates a Symbol definition.
      * 
      * @param item - the source item which is removed from the scene graph
      *     and becomes the symbol's definition.
      */
    def this(item: typings.paper.paper.Item) = this()
    def this(item: typings.paper.paper.Item, dontCenter: Boolean) = this()
  }
  @JSImport("paper/dist/paper-core", "SymbolDefinition")
  @js.native
  def SymbolDefinition: Instantiable2[
    /* item */ typings.paper.paper.Item, 
    /* dontCenter */ js.UndefOr[Boolean], 
    typings.paper.paper.SymbolDefinition
  ] = js.native
  @scala.inline
  def SymbolDefinition_=(
    x: Instantiable2[
      /* item */ typings.paper.paper.Item, 
      /* dontCenter */ js.UndefOr[Boolean], 
      typings.paper.paper.SymbolDefinition
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SymbolDefinition")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "SymbolItem")
  @js.native
  class SymbolItem protected ()
    extends typings.paper.paper.SymbolItem {
    def this(definition: typings.paper.paper.Item) = this()
    /** 
      * Creates a new symbol item.
      * 
      * @param definition - the definition to place or an
      *     item to place as a symbol
      * @param point - the center point of the placed symbol
      */
    def this(definition: typings.paper.paper.SymbolDefinition) = this()
    def this(definition: typings.paper.paper.Item, point: typings.paper.paper.Point) = this()
    def this(definition: typings.paper.paper.SymbolDefinition, point: typings.paper.paper.Point) = this()
  }
  @JSImport("paper/dist/paper-core", "SymbolItem")
  @js.native
  def SymbolItem: Instantiable2[
    /* definition */ typings.paper.paper.SymbolDefinition | typings.paper.paper.Item, 
    /* point */ js.UndefOr[typings.paper.paper.Point], 
    typings.paper.paper.SymbolItem
  ] = js.native
  @scala.inline
  def SymbolItem_=(
    x: Instantiable2[
      /* definition */ typings.paper.paper.SymbolDefinition | typings.paper.paper.Item, 
      /* point */ js.UndefOr[typings.paper.paper.Point], 
      typings.paper.paper.SymbolItem
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SymbolItem")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "TextItem")
  @js.native
  class TextItem ()
    extends typings.paper.paper.TextItem
  @JSImport("paper/dist/paper-core", "TextItem")
  @js.native
  def TextItem: Instantiable0[typings.paper.paper.TextItem] = js.native
  @scala.inline
  def TextItem_=(x: Instantiable0[typings.paper.paper.TextItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextItem")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Tool")
  @js.native
  class Tool ()
    extends typings.paper.paper.Tool
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "ToolEvent")
  @js.native
  class ToolEvent ()
    extends typings.paper.paper.ToolEvent
  @JSImport("paper/dist/paper-core", "ToolEvent")
  @js.native
  def ToolEvent: Instantiable0[typings.paper.paper.ToolEvent] = js.native
  @scala.inline
  def ToolEvent_=(x: Instantiable0[typings.paper.paper.ToolEvent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ToolEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("paper/dist/paper-core", "Tool")
  @js.native
  def Tool_ : Instantiable0[typings.paper.paper.Tool] = js.native
  
  @scala.inline
  def Tool__=(x: Instantiable0[typings.paper.paper.Tool]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tool")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Tween")
  @js.native
  class Tween protected ()
    extends typings.paper.paper.Tween {
    /** 
      * Creates a new tween.
      * 
      * @param object - the object to tween the properties on
      * @param from - the state at the start of the tweening
      * @param to - the state at the end of the tweening
      * @param duration - the duration of the tweening
      * @param easing - the type of the easing
      *     function or the easing function
      * @param start - whether to start tweening automatically
      */
    def this(`object`: js.Object, from: js.Object, to: js.Object, duration: Double) = this()
    def this(`object`: js.Object, from: js.Object, to: js.Object, duration: Double, easing: String) = this()
    def this(`object`: js.Object, from: js.Object, to: js.Object, duration: Double, easing: js.Function) = this()
    def this(
      `object`: js.Object,
      from: js.Object,
      to: js.Object,
      duration: Double,
      easing: js.UndefOr[scala.Nothing],
      start: Boolean
    ) = this()
    def this(
      `object`: js.Object,
      from: js.Object,
      to: js.Object,
      duration: Double,
      easing: String,
      start: Boolean
    ) = this()
    def this(
      `object`: js.Object,
      from: js.Object,
      to: js.Object,
      duration: Double,
      easing: js.Function,
      start: Boolean
    ) = this()
  }
  @JSImport("paper/dist/paper-core", "Tween")
  @js.native
  def Tween: Instantiable6[
    /* object */ js.Object, 
    /* from */ js.Object, 
    /* to */ js.Object, 
    /* duration */ Double, 
    /* easing */ js.UndefOr[String | js.Function], 
    /* start */ js.UndefOr[Boolean], 
    typings.paper.paper.Tween
  ] = js.native
  @scala.inline
  def Tween_=(
    x: Instantiable6[
      /* object */ js.Object, 
      /* from */ js.Object, 
      /* to */ js.Object, 
      /* duration */ Double, 
      /* easing */ js.UndefOr[String | js.Function], 
      /* start */ js.UndefOr[Boolean], 
      typings.paper.paper.Tween
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tween")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "View")
  @js.native
  class View ()
    extends typings.paper.paper.View
  @JSImport("paper/dist/paper-core", "View")
  @js.native
  def View_ : Instantiable0[typings.paper.paper.View] = js.native
  
  @scala.inline
  def View__=(x: Instantiable0[typings.paper.paper.View]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
  
  @JSImport("paper/dist/paper-core", "activate")
  @js.native
  def activate(): Unit = js.native
  @JSImport("paper/dist/paper-core", "activate")
  @js.native
  def activate_FpaperCoreMod: js.Function0[Unit] = js.native
  
  @scala.inline
  def activate_FpaperCoreMod_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activate")(x.asInstanceOf[js.Any])
  
  @JSImport("paper/dist/paper-core", "execute")
  @js.native
  def execute: js.Function2[/* code */ String, /* options */ js.UndefOr[js.Object], Unit] = js.native
  @JSImport("paper/dist/paper-core", "execute")
  @js.native
  def execute(code: String): Unit = js.native
  @JSImport("paper/dist/paper-core", "execute")
  @js.native
  def execute(code: String, options: js.Object): Unit = js.native
  @scala.inline
  def execute_=(x: js.Function2[/* code */ String, /* options */ js.UndefOr[js.Object], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("execute")(x.asInstanceOf[js.Any])
  
  @JSImport("paper/dist/paper-core", "install")
  @js.native
  def install: js.Function1[/* scope */ js.Any, Unit] = js.native
  @JSImport("paper/dist/paper-core", "install")
  @js.native
  def install(scope: js.Any): Unit = js.native
  @scala.inline
  def install_=(x: js.Function1[/* scope */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("install")(x.asInstanceOf[js.Any])
  
  @JSImport("paper/dist/paper-core", "project")
  @js.native
  def project: typings.paper.paper.Project = js.native
  @scala.inline
  def project_=(x: typings.paper.paper.Project): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("project")(x.asInstanceOf[js.Any])
  
  @JSImport("paper/dist/paper-core", "projects")
  @js.native
  def projects: js.Array[typings.paper.paper.Project] = js.native
  @scala.inline
  def projects_=(x: js.Array[typings.paper.paper.Project]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("projects")(x.asInstanceOf[js.Any])
  
  @JSImport("paper/dist/paper-core", "settings")
  @js.native
  def settings: js.Any = js.native
  @scala.inline
  def settings_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("settings")(x.asInstanceOf[js.Any])
  
  @JSImport("paper/dist/paper-core", "setup")
  @js.native
  def setup: js.Function1[/* element */ HTMLCanvasElement | String | typings.paper.paper.Size, Unit] = js.native
  @JSImport("paper/dist/paper-core", "setup")
  @js.native
  def setup(element: String): Unit = js.native
  @JSImport("paper/dist/paper-core", "setup")
  @js.native
  def setup(element: typings.paper.paper.Size): Unit = js.native
  @JSImport("paper/dist/paper-core", "setup")
  @js.native
  def setup(element: HTMLCanvasElement): Unit = js.native
  @scala.inline
  def setup_=(x: js.Function1[/* element */ HTMLCanvasElement | String | typings.paper.paper.Size, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setup")(x.asInstanceOf[js.Any])
  
  @JSImport("paper/dist/paper-core", "tool")
  @js.native
  def tool: typings.paper.paper.Tool = js.native
  @scala.inline
  def tool_=(x: typings.paper.paper.Tool): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tool")(x.asInstanceOf[js.Any])
  
  @JSImport("paper/dist/paper-core", "tools")
  @js.native
  def tools: js.Array[typings.paper.paper.Tool] = js.native
  @scala.inline
  def tools_=(x: js.Array[typings.paper.paper.Tool]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tools")(x.asInstanceOf[js.Any])
  
  @JSImport("paper/dist/paper-core", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @JSImport("paper/dist/paper-core", "view")
  @js.native
  def view: typings.paper.paper.View = js.native
  @scala.inline
  def view_=(x: typings.paper.paper.View): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("view")(x.asInstanceOf[js.Any])
}
