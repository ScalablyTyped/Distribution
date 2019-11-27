package typings.p5.p5Mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:no-empty-interface
@JSImport("p5", JSImport.Namespace)
@js.native
class ^ protected ()
  extends typings.p5.p5Mod.p5 {
  /**
    *   This is the p5 instance constructor. A p5 instance
    *   holds all the properties and methods related to a
    *   p5 sketch. It expects an incoming sketch closure
    *   and it can also take an optional node parameter
    *   for attaching the generated p5 canvas to a node.
    *   The sketch closure takes the newly created p5
    *   instance as its sole argument and may optionally
    *   set preload(), setup(), and/or draw() properties
    *   on it for running a sketch.
    *
    *   A p5 sketch can run in "global" or "instance"
    *   mode: "global" - all properties and methods are
    *   attached to the window "instance" - all properties
    *   and methods are bound to this p5 object
    *
    *   @param sketch a closure that can set optional
    *   preload(), setup(), and/or draw() properties on
    *   the given p5 instance
    *   @param [node] element to attach canvas to
    *   @return a p5 instance
    */
  def this(sketch: js.Function1[/* repeated */ js.Any, _]) = this()
  def this(sketch: js.Function1[/* repeated */ js.Any, _], node: HTMLElement) = this()
  /**
    *   Allows for the friendly error system (FES) to be
    *   turned off when creating a sketch, which can give
    *   a significant boost to performance when needed.
    *   See  disabling the friendly error system.
    */
  /* CompleteClass */
  override var disableFriendlyErrors: Boolean = js.native
  /**
    *   Called directly after setup(), the draw() function
    *   continuously executes the lines of code contained
    *   inside its block until the program is stopped or
    *   noLoop() is called. Note if noLoop() is called in
    *   setup(), draw() will still be executed once before
    *   stopping. draw() is called automatically and
    *   should never be called explicitly.  It should
    *   always be controlled with noLoop(), redraw() and
    *   loop(). After noLoop() stops the code in draw()
    *   from executing, redraw() causes the code inside
    *   draw() to execute once, and loop() will cause the
    *   code inside draw() to resume executing
    *   continuously.
    *
    *
    *   The number of times draw() executes in each second
    *   may be controlled with the frameRate() function.
    *
    *
    *   There can only be one draw() function for each
    *   sketch, and draw() must exist if you want the code
    *   to run continuously, or to process events such as
    *   mousePressed(). Sometimes, you might have an empty
    *   call to draw() in your program, as shown in the
    *   above example.
    *
    *
    *   It is important to note that the drawing
    *   coordinate system will be reset at the beginning
    *   of each draw() call. If any transformations are
    *   performed within draw() (ex: scale, rotate,
    *   translate), their effects will be undone at the
    *   beginning of draw(), so transformations will not
    *   accumulate over time. On the other hand, styling
    *   applied (ex: fill, stroke, etc) will remain in
    *   effect.
    */
  /* CompleteClass */
  override def draw(): Unit = js.native
  /**
    *   Called directly before setup(), the preload()
    *   function is used to handle asynchronous loading of
    *   external files in a blocking way. If a preload
    *   function is defined, setup() will wait until any
    *   load calls within have finished. Nothing besides
    *   load calls (loadImage, loadJSON, loadFont,
    *   loadStrings, etc.) should be inside the preload
    *   function. If asynchronous loading is preferred,
    *   the load methods can instead be called in setup()
    *   or anywhere else with the use of a callback
    *   parameter.  By default the text "loading..." will
    *   be displayed. To make your own loading page,
    *   include an HTML element with id "p5_loading" in
    *   your page. More information here.
    */
  /* CompleteClass */
  override def preload(): Unit = js.native
  /**
    *   Removes the entire p5 sketch. This will remove the
    *   canvas and any elements created by p5.js. It will
    *   also stop the draw loop and unbind any properties
    *   or methods from the window global scope. It will
    *   leave a variable p5 in case you wanted to create a
    *   new p5 sketch. If you like, you can set p5 = null
    *   to erase it. While all functions and variables and
    *   objects created by the p5 library will be removed,
    *   any other global variables created by your code
    *   will remain.
    */
  /* CompleteClass */
  override def remove(): Unit = js.native
  /**
    *   The setup() function is called once when the
    *   program starts. It's used to define initial
    *   environment properties such as screen size and
    *   background color and to load media such as images
    *   and fonts as the program starts. There can only be
    *   one setup() function for each program and it
    *   shouldn't be called again after its initial
    *   execution.  Note: Variables declared within
    *   setup() are not accessible within other functions,
    *   including draw().
    */
  /* CompleteClass */
  override def setup(): Unit = js.native
}

