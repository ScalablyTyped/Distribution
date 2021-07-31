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
    extends StObject
       with typings.paper.paper.Color {
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
  def Color: TypeofColor & (Instantiable4[
    /* red */ Double, 
    /* green */ Double, 
    /* blue */ Double, 
    /* alpha */ js.UndefOr[Double], 
    typings.paper.paper.Color
  ]) = js.native
  @scala.inline
  def Color_=(
    x: TypeofColor & (Instantiable4[
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
    extends StObject
       with typings.paper.paper.CompoundPath {
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
    extends StObject
       with typings.paper.paper.Curve {
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
    extends StObject
       with typings.paper.paper.CurveLocation {
    /** 
      * Creates a new CurveLocation object.
      */
    def this(curve: typings.paper.paper.Curve, time: Double) = this()
    def this(curve: typings.paper.paper.Curve, time: Double, point: typings.paper.paper.Point) = this()
    
    /** 
      * The curvature of the {@link #curve} at the given location.
      */
    /* CompleteClass */
    override val curvature: Double = js.native
    
    /** 
      * The curve that this location belongs to.
      */
    /* CompleteClass */
    override val curve: typings.paper.paper.Curve = js.native
    
    /** 
      * The length of the curve from its beginning up to the location described
      * by this object.
      */
    /* CompleteClass */
    override val curveOffset: Double = js.native
    
    /** 
      * The distance from the queried point to the returned location.
      * 
      * @see Curve#getNearestLocation(point)
      * @see PathItem#getNearestLocation(point)
      */
    /* CompleteClass */
    override val distance: Double = js.native
    
    /** 
      * Checks whether tow CurveLocation objects are describing the same location
      * on a path, by applying the same tolerances as elsewhere when dealing with
      * curve-time parameters.
      * 
      * @return true if the locations are equal
      */
    /* CompleteClass */
    override def equals(location: typings.paper.paper.CurveLocation): Boolean = js.native
    
    /** 
      * Checks if the location is an intersection with another curve and is
      * part of an overlap between the two involved paths.
      * 
      * @see #isCrossing()
      * @see #isTouching()
      * 
      * @return true if the location is an intersection that is
      * part of an overlap between the two involved paths
      */
    /* CompleteClass */
    override def hasOverlap(): Boolean = js.native
    
    /** 
      * The index of the {@link #curve} within the {@link Path#curves} list, if
      * it is part of a {@link Path} item.
      */
    /* CompleteClass */
    override val index: Double = js.native
    
    /** 
      * The curve location on the intersecting curve, if this location is the
      * result of a call to {@link PathItem#getIntersections} /
      * {@link Curve#getIntersections}.
      */
    /* CompleteClass */
    override val intersection: typings.paper.paper.CurveLocation = js.native
    
    /** 
      * Checks if the location is an intersection with another curve and is
      * crossing the other curve, as opposed to just touching it.
      * 
      * @see #isTouching()
      * 
      * @return true if the location is an intersection that is
      * crossing another curve
      */
    /* CompleteClass */
    override def isCrossing(): Boolean = js.native
    
    /** 
      * Checks if the location is an intersection with another curve and is
      * merely touching the other curve, as opposed to crossing it.
      * 
      * @see #isCrossing()
      * 
      * @return true if the location is an intersection that is
      * merely touching another curve
      */
    /* CompleteClass */
    override def isTouching(): Boolean = js.native
    
    /** 
      * The normal vector to the {@link #curve} at the given location.
      */
    /* CompleteClass */
    override val normal: typings.paper.paper.Point = js.native
    
    /** 
      * The length of the path from its beginning up to the location described
      * by this object. If the curve is not part of a path, then the length
      * within the curve is returned instead.
      */
    /* CompleteClass */
    override val offset: Double = js.native
    
    /** 
      * The path that this locations is situated on.
      */
    /* CompleteClass */
    override val path: typings.paper.paper.Path = js.native
    
    /** 
      * The point which is defined by the {@link #curve} and
      * {@link #time}.
      */
    /* CompleteClass */
    override val point: typings.paper.paper.Point = js.native
    
    /** 
      * The segment of the curve which is closer to the described location.
      */
    /* CompleteClass */
    override val segment: typings.paper.paper.Segment = js.native
    
    /** 
      * The tangential vector to the {@link #curve} at the given location.
      */
    /* CompleteClass */
    override val tangent: typings.paper.paper.Point = js.native
    
    /** 
      * The curve-time parameter, as used by various bezier curve calculations.
      * It is value between `0` (beginning of the curve) and `1` (end of the
      * curve).
      */
    /* CompleteClass */
    override val time: Double = js.native
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
    extends StObject
       with typings.paper.paper.Event {
    
    /** 
      * The current state of the keyboard modifiers.
      * 
      * @see Key.modifiers
      */
    /* CompleteClass */
    override val modifiers: js.Any = js.native
    
    /** 
      * Cancels the event if it is cancelable, without stopping further
      * propagation of the event.
      */
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /** 
      * Cancels the event if it is cancelable, and stops stopping further
      * propagation of the event. This is has the same effect as calling both
      * {@link #stopPropagation} and {@link #preventDefault}.
      * 
      * Any handler can also return `false` to indicate that `stop()` should be
      * called right after.
      */
    /* CompleteClass */
    override def stop(): Unit = js.native
    
    /** 
      * Prevents further propagation of the current event.
      */
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /** 
      * The time at which the event was created, in milliseconds since the epoch.
      */
    /* CompleteClass */
    override val timeStamp: Double = js.native
  }
  @JSImport("paper/dist/paper-core", "Event")
  @js.native
  def Event: Instantiable0[typings.paper.paper.Event] = js.native
  @scala.inline
  def Event_=(x: Instantiable0[typings.paper.paper.Event]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Event")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Gradient")
  @js.native
  class Gradient ()
    extends StObject
       with typings.paper.paper.Gradient {
    
    /** 
      * Checks whether the gradient is equal to the supplied gradient.
      * 
      * @return true if they are equal
      */
    /* CompleteClass */
    override def equals(gradient: typings.paper.paper.Gradient): Boolean = js.native
    
    /** 
      * Specifies whether the gradient is radial or linear.
      */
    /* CompleteClass */
    var radial: Boolean = js.native
    
    /** 
      * The gradient stops on the gradient ramp.
      */
    /* CompleteClass */
    var stops: js.Array[typings.paper.paper.GradientStop] = js.native
  }
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
    extends StObject
       with typings.paper.paper.GradientStop {
    def this(color: typings.paper.paper.Color) = this()
    def this(color: Unit, offset: Double) = this()
    def this(color: typings.paper.paper.Color, offset: Double) = this()
    
    /** 
      * The color of the gradient stop.
      */
    /* CompleteClass */
    var color: typings.paper.paper.Color = js.native
    
    /** 
      * The ramp-point of the gradient stop as a value between `0` and `1`.
      */
    /* CompleteClass */
    var offset: Double = js.native
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
    extends StObject
       with typings.paper.paper.Group {
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
    extends StObject
       with typings.paper.paper.HitResult {
    
    /** 
      * If the HitResult has a type of 'pixel', this property refers to the color
      * of the pixel on the {@link Raster} that was hit.
      */
    /* CompleteClass */
    var color: typings.paper.paper.Color | Null = js.native
    
    /** 
      * The item that was hit.
      */
    /* CompleteClass */
    var item: typings.paper.paper.Item = js.native
    
    /** 
      * If the HitResult has a type of 'curve' or 'stroke', this property gives
      * more information about the exact position that was hit on the path.
      */
    /* CompleteClass */
    var location: typings.paper.paper.CurveLocation = js.native
    
    /** 
      * If the HitResult has a {@link HitResult#type} of `'bounds'`, this
      * property describes which corner of the bounding rectangle was hit.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /** 
      * Describes the actual coordinates of the segment, handle or bounding box
      * corner that was hit.
      */
    /* CompleteClass */
    var point: typings.paper.paper.Point = js.native
    
    /** 
      * If the HitResult has a type of 'stroke', 'segment', 'handle-in' or
      * 'handle-out', this property refers to the segment that was hit or that
      * is closest to the hitResult.location on the curve.
      */
    /* CompleteClass */
    var segment: typings.paper.paper.Segment = js.native
    
    /** 
      * Describes the type of the hit result. For example, if you hit a segment
      * point, the type would be `'segment'`.
      */
    /* CompleteClass */
    var `type`: String = js.native
  }
  @JSImport("paper/dist/paper-core", "HitResult")
  @js.native
  def HitResult: Instantiable0[typings.paper.paper.HitResult] = js.native
  @scala.inline
  def HitResult_=(x: Instantiable0[typings.paper.paper.HitResult]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HitResult")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Item")
  @js.native
  class Item ()
    extends StObject
       with typings.paper.paper.Item
  @JSImport("paper/dist/paper-core", "Item")
  @js.native
  def Item: Instantiable0[typings.paper.paper.Item] = js.native
  @scala.inline
  def Item_=(x: Instantiable0[typings.paper.paper.Item]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Key")
  @js.native
  class Key ()
    extends StObject
       with typings.paper.paper.Key
  @JSImport("paper/dist/paper-core", "Key")
  @js.native
  def Key: TypeofKey & Instantiable0[typings.paper.paper.Key] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "KeyEvent")
  @js.native
  class KeyEvent ()
    extends StObject
       with typings.paper.paper.KeyEvent {
    
    /** 
      * The character representation of the key that caused this key event,
      * taking into account the current key-modifiers (e.g. shift, control,
      * caps-lock, etc.)
      */
    /* CompleteClass */
    var character: String = js.native
    
    /** 
      * The key that caused this key event, either as a lower-case character or
      * special key descriptor.
      */
    /* CompleteClass */
    var key: String = js.native
    
    /** 
      * The current state of the keyboard modifiers.
      * 
      * @see Key.modifiers
      */
    /* CompleteClass */
    override val modifiers: js.Any = js.native
    
    /** 
      * Cancels the event if it is cancelable, without stopping further
      * propagation of the event.
      */
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /** 
      * Cancels the event if it is cancelable, and stops stopping further
      * propagation of the event. This is has the same effect as calling both
      * {@link #stopPropagation} and {@link #preventDefault}.
      * 
      * Any handler can also return `false` to indicate that `stop()` should be
      * called right after.
      */
    /* CompleteClass */
    override def stop(): Unit = js.native
    
    /** 
      * Prevents further propagation of the current event.
      */
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /** 
      * The time at which the event was created, in milliseconds since the epoch.
      */
    /* CompleteClass */
    override val timeStamp: Double = js.native
    
    /** 
      * The type of mouse event.
      */
    /* CompleteClass */
    var `type`: String = js.native
  }
  @JSImport("paper/dist/paper-core", "KeyEvent")
  @js.native
  def KeyEvent: Instantiable0[typings.paper.paper.KeyEvent] = js.native
  @scala.inline
  def KeyEvent_=(x: Instantiable0[typings.paper.paper.KeyEvent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KeyEvent")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Key_=(x: TypeofKey & Instantiable0[typings.paper.paper.Key]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Key")(x.asInstanceOf[js.Any])
  
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
    extends StObject
       with typings.paper.paper.Layer {
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
    extends StObject
       with typings.paper.paper.Matrix
  @JSImport("paper/dist/paper-core", "Matrix")
  @js.native
  def Matrix: Instantiable0[typings.paper.paper.Matrix] = js.native
  @scala.inline
  def Matrix_=(x: Instantiable0[typings.paper.paper.Matrix]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Matrix")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "MouseEvent")
  @js.native
  class MouseEvent ()
    extends StObject
       with typings.paper.paper.MouseEvent {
    
    /** 
      * The current target for the event, as the event traverses the scene graph.
      * It always refers to the element the event handler has been attached to as
      * opposed to {@link #target} which identifies the element on
      * which the event occurred.
      */
    /* CompleteClass */
    var currentTarget: typings.paper.paper.Item = js.native
    
    /* CompleteClass */
    var delta: typings.paper.paper.Point = js.native
    
    /** 
      * The current state of the keyboard modifiers.
      * 
      * @see Key.modifiers
      */
    /* CompleteClass */
    override val modifiers: js.Any = js.native
    
    /** 
      * The position of the mouse in project coordinates when the event was
      * fired.
      */
    /* CompleteClass */
    var point: typings.paper.paper.Point = js.native
    
    /** 
      * Cancels the event if it is cancelable, without stopping further
      * propagation of the event.
      */
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /** 
      * Cancels the event if it is cancelable, and stops stopping further
      * propagation of the event. This is has the same effect as calling both
      * {@link #stopPropagation} and {@link #preventDefault}.
      * 
      * Any handler can also return `false` to indicate that `stop()` should be
      * called right after.
      */
    /* CompleteClass */
    override def stop(): Unit = js.native
    
    /** 
      * Prevents further propagation of the current event.
      */
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /** 
      * The item that dispatched the event. It is different from
      * {@link #currentTarget} when the event handler is called during
      * the bubbling phase of the event.
      */
    /* CompleteClass */
    var target: typings.paper.paper.Item = js.native
    
    /** 
      * The time at which the event was created, in milliseconds since the epoch.
      */
    /* CompleteClass */
    override val timeStamp: Double = js.native
    
    /** 
      * The type of mouse event.
      */
    /* CompleteClass */
    var `type`: String = js.native
  }
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
    extends StObject
       with typings.paper.paper.PaperScope
  @JSImport("paper/dist/paper-core", "PaperScope")
  @js.native
  def PaperScope: TypeofPaperScope & Instantiable0[typings.paper.paper.PaperScope] = js.native
  @scala.inline
  def PaperScope_=(x: TypeofPaperScope & Instantiable0[typings.paper.paper.PaperScope]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PaperScope")(x.asInstanceOf[js.Any])
  
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
    extends StObject
       with typings.paper.paper.Path {
    def this(segments: js.Array[typings.paper.paper.Segment]) = this()
  }
  @JSImport("paper/dist/paper-core", "Path")
  @js.native
  def Path: TypeofPath & (Instantiable1[
    /* segments */ js.UndefOr[js.Array[typings.paper.paper.Segment]], 
    typings.paper.paper.Path
  ]) = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "PathItem")
  @js.native
  class PathItem ()
    extends StObject
       with typings.paper.paper.PathItem
  @JSImport("paper/dist/paper-core", "PathItem")
  @js.native
  def PathItem: TypeofPathItem & Instantiable0[typings.paper.paper.PathItem] = js.native
  @scala.inline
  def PathItem_=(x: TypeofPathItem & Instantiable0[typings.paper.paper.PathItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PathItem")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Path_=(
    x: TypeofPath & (Instantiable1[
      /* segments */ js.UndefOr[js.Array[typings.paper.paper.Segment]], 
      typings.paper.paper.Path
    ])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Point")
  @js.native
  class Point protected ()
    extends StObject
       with typings.paper.paper.Point {
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
  def Point: TypeofPoint & (Instantiable2[/* x */ Double, /* y */ Double, typings.paper.paper.Point]) = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "PointText")
  @js.native
  class PointText protected ()
    extends StObject
       with typings.paper.paper.PointText {
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
  def Point_=(x: TypeofPoint & (Instantiable2[/* x */ Double, /* y */ Double, typings.paper.paper.Point])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Point")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Project")
  @js.native
  class Project protected ()
    extends StObject
       with typings.paper.paper.Project {
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
    extends StObject
       with typings.paper.paper.Raster {
    def this(source: String) = this()
    def this(source: HTMLCanvasElement) = this()
    def this(source: HTMLImageElement) = this()
    def this(source: String, position: typings.paper.paper.Point) = this()
    def this(source: Unit, position: typings.paper.paper.Point) = this()
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
    extends StObject
       with typings.paper.paper.Rectangle {
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
    extends StObject
       with typings.paper.paper.Segment {
    def this(point: typings.paper.paper.Point) = this()
    def this(point: Unit, handleIn: typings.paper.paper.Point) = this()
    def this(point: typings.paper.paper.Point, handleIn: typings.paper.paper.Point) = this()
    def this(point: Unit, handleIn: Unit, handleOut: typings.paper.paper.Point) = this()
    def this(point: Unit, handleIn: typings.paper.paper.Point, handleOut: typings.paper.paper.Point) = this()
    def this(point: typings.paper.paper.Point, handleIn: Unit, handleOut: typings.paper.paper.Point) = this()
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
    extends StObject
       with typings.paper.paper.Shape
  @JSImport("paper/dist/paper-core", "Shape")
  @js.native
  def Shape: TypeofShape & Instantiable0[typings.paper.paper.Shape] = js.native
  @scala.inline
  def Shape_=(x: TypeofShape & Instantiable0[typings.paper.paper.Shape]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Shape")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Size")
  @js.native
  class Size protected ()
    extends StObject
       with typings.paper.paper.Size {
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
  def Size: TypeofSize & (Instantiable2[/* width */ Double, /* height */ Double, typings.paper.paper.Size]) = js.native
  @scala.inline
  def Size_=(x: TypeofSize & (Instantiable2[/* width */ Double, /* height */ Double, typings.paper.paper.Size])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Size")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Style")
  @js.native
  class Style protected ()
    extends StObject
       with typings.paper.paper.Style {
    /** 
      * Style objects don't need to be created directly. Just pass an object to
      * {@link Item#style} or {@link Project#currentStyle}, it will be converted
      * to a Style object internally.
      */
    def this(style: js.Object) = this()
    
    /** 
      * Specifies an array containing the dash and gap lengths of the stroke.
      */
    /* CompleteClass */
    var dashArray: js.Array[Double] = js.native
    
    /** 
      * The dash offset of the stroke.
      */
    /* CompleteClass */
    var dashOffset: Double = js.native
    
    /** 
      * The fill color.
      */
    /* CompleteClass */
    var fillColor: typings.paper.paper.Color | Null = js.native
    
    /** 
      * The fill-rule with which the shape gets filled. Please note that only
      * modern browsers support fill-rules other than `'nonzero'`.
      */
    /* CompleteClass */
    var fillRule: String = js.native
    
    /** 
      * The font-family to be used in text content.
      */
    /* CompleteClass */
    var fontFamily: String = js.native
    
    /** 
      * The font size of text content, as a number in pixels, or as a string with
      * optional units `'px'`, `'pt'` and `'em'`.
      */
    /* CompleteClass */
    var fontSize: Double | String = js.native
    
    /** 
      * The font-weight to be used in text content.
      */
    /* CompleteClass */
    var fontWeight: String | Double = js.native
    
    /** 
      * The justification of text paragraphs.
      */
    /* CompleteClass */
    var justification: String = js.native
    
    /** 
      * The text leading of text content.
      */
    /* CompleteClass */
    var leading: Double | String = js.native
    
    /** 
      * The miter limit of the stroke. When two line segments meet at a sharp
      * angle and miter joins have been specified for {@link #strokeJoin}, it is
      * possible for the miter to extend far beyond the {@link #strokeWidth} of
      * the path. The miterLimit imposes a limit on the ratio of the miter length
      * to the {@link #strokeWidth}.
      */
    /* CompleteClass */
    var miterLimit: Double = js.native
    
    /** 
      * The color the item is highlighted with when selected. If the item does
      * not specify its own color, the color defined by its layer is used instead.
      */
    /* CompleteClass */
    var selectedColor: typings.paper.paper.Color | Null = js.native
    
    /** 
      * The shadow's blur radius.
      */
    /* CompleteClass */
    var shadowBlur: Double = js.native
    
    /** 
      * The shadow color.
      */
    /* CompleteClass */
    var shadowColor: typings.paper.paper.Color | Null = js.native
    
    /** 
      * The shadow's offset.
      */
    /* CompleteClass */
    var shadowOffset: typings.paper.paper.Point = js.native
    
    /** 
      * The shape to be used at the beginning and end of open {@link Path} items,
      * when they have a stroke.
      */
    /* CompleteClass */
    var strokeCap: String = js.native
    
    /** 
      * The color of the stroke.
      */
    /* CompleteClass */
    var strokeColor: typings.paper.paper.Color | Null = js.native
    
    /** 
      * The shape to be used at the segments and corners of {@link Path} items
      * when they have a stroke.
      */
    /* CompleteClass */
    var strokeJoin: String = js.native
    
    /** 
      * Specifies whether the stroke is to be drawn taking the current affine
      * transformation into account (the default behavior), or whether it should
      * appear as a non-scaling stroke.
      */
    /* CompleteClass */
    var strokeScaling: Boolean = js.native
    
    /** 
      * The width of the stroke.
      */
    /* CompleteClass */
    var strokeWidth: Double = js.native
    
    /** 
      * The view that this style belongs to.
      */
    /* CompleteClass */
    override val view: typings.paper.paper.View = js.native
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
    extends StObject
       with typings.paper.paper.SymbolDefinition {
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
    extends StObject
       with typings.paper.paper.SymbolItem {
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
    extends StObject
       with typings.paper.paper.TextItem
  @JSImport("paper/dist/paper-core", "TextItem")
  @js.native
  def TextItem: Instantiable0[typings.paper.paper.TextItem] = js.native
  @scala.inline
  def TextItem_=(x: Instantiable0[typings.paper.paper.TextItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextItem")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "Tool")
  @js.native
  class Tool ()
    extends StObject
       with typings.paper.paper.Tool
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("paper/dist/paper-core", "ToolEvent")
  @js.native
  class ToolEvent ()
    extends StObject
       with typings.paper.paper.ToolEvent {
    
    /** 
      * The number of times the mouse event was fired.
      */
    /* CompleteClass */
    var count: Double = js.native
    
    /** 
      * The difference between the current position and the last position of the
      * mouse when the event was fired. In case of the mouseup event, the
      * difference to the mousedown position is returned.
      */
    /* CompleteClass */
    var delta: typings.paper.paper.Point = js.native
    
    /** 
      * The position of the mouse in project coordinates when the mouse button
      * was last clicked.
      */
    /* CompleteClass */
    var downPoint: typings.paper.paper.Point = js.native
    
    /** 
      * The item at the position of the mouse (if any).
      * 
      * If the item is contained within one or more {@link Group} or
      * {@link CompoundPath} items, the most top level group or compound path
      * that it is contained within is returned.
      */
    /* CompleteClass */
    var item: typings.paper.paper.Item = js.native
    
    /** 
      * The position of the mouse in project coordinates when the previous
      * event was fired.
      */
    /* CompleteClass */
    var lastPoint: typings.paper.paper.Point = js.native
    
    /** 
      * The point in the middle between {@link #lastPoint} and
      * {@link #point}. This is a useful position to use when creating
      * artwork based on the moving direction of the mouse, as returned by
      * {@link #delta}.
      */
    /* CompleteClass */
    var middlePoint: typings.paper.paper.Point = js.native
    
    /** 
      * The current state of the keyboard modifiers.
      * 
      * @see Key.modifiers
      */
    /* CompleteClass */
    override val modifiers: js.Any = js.native
    
    /** 
      * The position of the mouse in project coordinates when the event was
      * fired.
      */
    /* CompleteClass */
    var point: typings.paper.paper.Point = js.native
    
    /** 
      * Cancels the event if it is cancelable, without stopping further
      * propagation of the event.
      */
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /** 
      * Cancels the event if it is cancelable, and stops stopping further
      * propagation of the event. This is has the same effect as calling both
      * {@link #stopPropagation} and {@link #preventDefault}.
      * 
      * Any handler can also return `false` to indicate that `stop()` should be
      * called right after.
      */
    /* CompleteClass */
    override def stop(): Unit = js.native
    
    /** 
      * Prevents further propagation of the current event.
      */
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /** 
      * The time at which the event was created, in milliseconds since the epoch.
      */
    /* CompleteClass */
    override val timeStamp: Double = js.native
    
    /** 
      * The type of tool event.
      */
    /* CompleteClass */
    var `type`: String = js.native
  }
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
    extends StObject
       with typings.paper.paper.Tween {
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
    def this(
      `object`: js.Object,
      from: js.Object,
      to: js.Object,
      duration: Double,
      easing: Unit,
      start: Boolean
    ) = this()
    
    /** 
      * The function to be called when the tween is updated. It receives an
      * object as its sole argument, containing the current progress of the
      * tweening and the factor calculated by the easing function.
      */
    /* CompleteClass */
    var onUpdate: js.Function | Null = js.native
    
    /** 
      * Start tweening.
      */
    /* CompleteClass */
    override def start(): typings.paper.paper.Tween = js.native
    
    /** 
      * Stop tweening.
      */
    /* CompleteClass */
    override def stop(): typings.paper.paper.Tween = js.native
    
    /** 
      * Set a function that will be executed when the tween completes.
      * 
      * @param function - the function to execute when the tween
      *     completes
      */
    /* CompleteClass */
    override def `then`(callback: js.Function): typings.paper.paper.Tween = js.native
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
    extends StObject
       with typings.paper.paper.View
  @JSImport("paper/dist/paper-core", "View")
  @js.native
  def View_ : Instantiable0[typings.paper.paper.View] = js.native
  
  @scala.inline
  def View__=(x: Instantiable0[typings.paper.paper.View]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def activate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("activate")().asInstanceOf[Unit]
  @JSImport("paper/dist/paper-core", "activate")
  @js.native
  def activate_FpaperCoreMod: js.Function0[Unit] = js.native
  
  @scala.inline
  def activate_FpaperCoreMod_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activate")(x.asInstanceOf[js.Any])
  
  @JSImport("paper/dist/paper-core", "execute")
  @js.native
  def execute: js.Function2[/* code */ String, /* options */ js.UndefOr[js.Object], Unit] = js.native
  @scala.inline
  def execute(code: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(code.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def execute(code: String, options: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def execute_=(x: js.Function2[/* code */ String, /* options */ js.UndefOr[js.Object], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("execute")(x.asInstanceOf[js.Any])
  
  @JSImport("paper/dist/paper-core", "install")
  @js.native
  def install: js.Function1[/* scope */ js.Any, Unit] = js.native
  @scala.inline
  def install(scope: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
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
  @scala.inline
  def setup(element: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def setup(element: typings.paper.paper.Size): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def setup(element: HTMLCanvasElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
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
