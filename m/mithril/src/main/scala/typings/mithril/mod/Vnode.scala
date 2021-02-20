package typings.mithril.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Virtual DOM nodes, or vnodes, are Javascript objects that represent an element (or parts of the DOM). */
@js.native
trait Vnode[Attrs, State /* <: Lifecycle[Attrs, State] */] extends StObject {
  
  /** A hashmap of DOM attributes, events, properties and lifecycle methods. */
  var attrs: Attrs = js.native
  
  /** In most vnode types, the children property is an array of vnodes. For text and trusted HTML vnodes, The children property is either a string, a number or a boolean. */
  var children: js.UndefOr[ChildArrayOrPrimitive] = js.native
  
  /** The value used to map a DOM element to its respective item in an array of data. */
  var key: js.UndefOr[String | Double] = js.native
  
  /** An object that is persisted between redraws. In component vnodes, state is a shallow clone of the component object. */
  var state: State = js.native
  
  /** The nodeName of a DOM element. It may also be the string [ if a vnode is a fragment, # if it's a text vnode, or < if it's a trusted HTML vnode. Additionally, it may be a component. */
  var tag: String | (ComponentTypes[Attrs, State]) = js.native
  
  /**
    * This is used instead of children if a vnode contains a text node as its only child.
    * This is done for performance reasons.
    * Component vnodes never use the text property even if they have a text node as their only child.
    */
  var text: js.UndefOr[String | Double | Boolean] = js.native
}
object Vnode {
  
  @scala.inline
  def apply[Attrs, State /* <: Lifecycle[Attrs, State] */](attrs: Attrs, state: State, tag: String | (ComponentTypes[Attrs, State])): Vnode[Attrs, State] = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vnode[Attrs, State]]
  }
  
  @scala.inline
  implicit class VnodeMutableBuilder[Self <: Vnode[_, _], Attrs, State /* <: Lifecycle[Attrs, State] */] (val x: Self with (Vnode[Attrs, State])) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ChildArrayOrPrimitive): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String | (ComponentTypes[Attrs, State])): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagFunction1(value: /* vnode */ Vnode[Attrs, js.Object] => Component[Attrs, js.Object]): Self = StObject.set(x, "tag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setText(value: String | Double | Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
