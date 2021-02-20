package typings.paper

import org.scalablytyped.runtime.Shortcut
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("paper", JSImport.Namespace)
  @js.native
  val ^ : typings.paper.paper.PaperScope = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Color")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "CompoundPath")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Curve")
  @js.native
  class Curve protected ()
    extends typings.paper.paper.Curve {
    /** 
      * Creates a new curve object.
      */
    def this(segment1: typings.paper.paper.Segment, segment2: typings.paper.paper.Segment) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "CurveLocation")
  @js.native
  class CurveLocation protected ()
    extends typings.paper.paper.CurveLocation {
    /** 
      * Creates a new CurveLocation object.
      */
    def this(curve: typings.paper.paper.Curve, time: Double) = this()
    def this(curve: typings.paper.paper.Curve, time: Double, point: typings.paper.paper.Point) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Event")
  @js.native
  class Event ()
    extends typings.paper.paper.Event
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Gradient")
  @js.native
  class Gradient ()
    extends typings.paper.paper.Gradient
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "GradientStop")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Group")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "HitResult")
  @js.native
  class HitResult ()
    extends typings.paper.paper.HitResult
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Item")
  @js.native
  class Item ()
    extends typings.paper.paper.Item
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Key")
  @js.native
  class Key ()
    extends typings.paper.paper.Key
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "KeyEvent")
  @js.native
  class KeyEvent ()
    extends typings.paper.paper.KeyEvent
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Layer")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Matrix")
  @js.native
  /** 
    * Creates a 2D affine transformation matrix that describes the identity
    * transformation.
    */
  class Matrix ()
    extends typings.paper.paper.Matrix
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "MouseEvent")
  @js.native
  class MouseEvent ()
    extends typings.paper.paper.MouseEvent
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "PaperScope")
  @js.native
  /** 
    * Creates a PaperScope object.
    */
  class PaperScope ()
    extends typings.paper.paper.PaperScope
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "PaperScript")
  @js.native
  class PaperScript ()
    extends typings.paper.paper.PaperScript
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Path")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "PathItem")
  @js.native
  class PathItem ()
    extends typings.paper.paper.PathItem
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Point")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "PointText")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Project")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Raster")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Rectangle")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Segment")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Shape")
  @js.native
  class Shape ()
    extends typings.paper.paper.Shape
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Size")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Style")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "SymbolDefinition")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "SymbolItem")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "TextItem")
  @js.native
  class TextItem ()
    extends typings.paper.paper.TextItem
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Tool")
  @js.native
  class Tool ()
    extends typings.paper.paper.Tool
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "ToolEvent")
  @js.native
  class ToolEvent ()
    extends typings.paper.paper.ToolEvent
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "Tween")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper", "View")
  @js.native
  class View ()
    extends typings.paper.paper.View
  
  type _To = typings.paper.paper.PaperScope
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: typings.paper.paper.PaperScope = ^
}
