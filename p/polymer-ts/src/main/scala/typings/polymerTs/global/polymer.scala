package typings.polymerTs.global

import org.scalablytyped.runtime.Instantiable1
import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.HTMLSlotElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("polymer")
@js.native
object polymer extends js.Object {
  @js.native
  class Base ()
    extends typings.polymerTs.polymer.Base {
    /* CompleteClass */
    override val assignedSlot: HTMLSlotElement | Null = js.native
    /* CompleteClass */
    override var contentEditable: String = js.native
    /* CompleteClass */
    override var innerHTML: String = js.native
    /* CompleteClass */
    override var inputMode: String = js.native
    /* CompleteClass */
    override val isContentEditable: Boolean = js.native
    /**
      * Returns the first following sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val nextElementSibling: Element | Null = js.native
    /**
      * Returns the first preceding sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val previousElementSibling: Element | Null = js.native
    /* CompleteClass */
    override val style: CSSStyleDeclaration = js.native
  }
  
  @js.native
  class PolymerBase ()
    extends typings.polymerTs.polymer.PolymerBase {
    /* CompleteClass */
    override val assignedSlot: HTMLSlotElement | Null = js.native
    /* CompleteClass */
    override var contentEditable: String = js.native
    /* CompleteClass */
    override var innerHTML: String = js.native
    /* CompleteClass */
    override var inputMode: String = js.native
    /* CompleteClass */
    override val isContentEditable: Boolean = js.native
    /**
      * Returns the first following sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val nextElementSibling: Element | Null = js.native
    /**
      * Returns the first preceding sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val previousElementSibling: Element | Null = js.native
    /* CompleteClass */
    override val style: CSSStyleDeclaration = js.native
  }
  
  def createClass[T /* <: typings.polymerTs.polymer.Base */](element: Instantiable1[/* args (repeated) */ js.Any, T]): Instantiable1[/* args (repeated) */ js.Any, T] = js.native
  def createDomModule(definition: typings.polymerTs.polymer.Element): Unit = js.native
  def createElement[T /* <: typings.polymerTs.polymer.Base */](element: Instantiable1[/* args (repeated) */ js.Any, T]): Instantiable1[/* args (repeated) */ js.Any, T] = js.native
  def createEs6PolymerBase(): Unit = js.native
  def isRegistered(element: typings.polymerTs.polymer.Element): Boolean = js.native
  def prepareForRegistration(elementClass: js.Function): typings.polymerTs.polymer.Element = js.native
  /* static members */
  @js.native
  object Base extends js.Object {
    def create[T /* <: typings.polymerTs.polymer.Base */](args: js.Any*): T = js.native
    def register(): Unit = js.native
  }
  
}

