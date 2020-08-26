package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnhancedElementInstance[T] extends js.Object {
  /**
    * The locate strategy to be used with `selector` when finding the element within the DOM.
    */
  var locateStrategy: LocateStrategy = js.native
  /**
    * The name of the element as defined by its key in the parent section or the page object's `elements` definition.
    * This is the same name used with the `@` prefix in selector arguments for page object commands that refer to the element.
    */
  var name: String = js.native
  /**
    * A reference to the parent object instance.
    * This is the parent section or the page object that contained the definition for this object.
    */
  var parent: T = js.native
  /**
    * The selector string used to find the element in the DOM.
    */
  var selector: String = js.native
}

object EnhancedElementInstance {
  @scala.inline
  def apply[T](locateStrategy: LocateStrategy, name: String, parent: T, selector: String): EnhancedElementInstance[T] = {
    val __obj = js.Dynamic.literal(locateStrategy = locateStrategy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedElementInstance[T]]
  }
  @scala.inline
  implicit class EnhancedElementInstanceOps[Self <: EnhancedElementInstance[_], T] (val x: Self with EnhancedElementInstance[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocateStrategy(value: LocateStrategy): Self = this.set("locateStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: T): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
  }
  
}

