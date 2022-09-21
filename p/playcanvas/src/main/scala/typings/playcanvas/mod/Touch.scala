package typings.playcanvas.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A instance of a single point touch on a {@link TouchDevice}.
  */
@JSImport("playcanvas", "Touch")
@js.native
open class Touch protected ()
  extends StObject
     with Touch1 {
  /**
    * Create a new Touch object from the browser Touch.
    *
    * @param {globalThis.Touch} touch - The browser Touch object.
    */
  def this(touch: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Touch */ Any) = this()
  
  /**
    * The identifier of the touch.
    *
    * @type {number}
    */
  /* CompleteClass */
  var id: Double = js.native
  
  /**
    * The target element of the touch event.
    *
    * @type {Element}
    */
  /* CompleteClass */
  var target: Element = js.native
  
  /**
    * The original browser Touch object.
    *
    * @type {globalThis.Touch}
    */
  /* CompleteClass */
  var touch: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Touch */ Any = js.native
  
  /**
    * The x coordinate relative to the element that the TouchDevice is attached to.
    *
    * @type {number}
    */
  /* CompleteClass */
  var x: Double = js.native
  
  /**
    * The y coordinate relative to the element that the TouchDevice is attached to.
    *
    * @type {number}
    */
  /* CompleteClass */
  var y: Double = js.native
}
