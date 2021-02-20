package typings.preact.mod

import typings.preact.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Preact Virtual DOM
// -----------------------------------
@js.native
trait VNode[P] extends StObject {
  
  /**
  		 * The time that the rendering of this `vnode` was completed. Will only be
  		 * set when the devtools are attached.
  		 * Default value: `-1`
  		 */
  var endTime: js.UndefOr[Double] = js.native
  
  var key: Key = js.native
  
  var props: P with Children = js.native
  
  /**
  		 * ref is not guaranteed by React.ReactElement, for compatibility reasons
  		 * with popular react libs we define it as optional too
  		 */
  var ref: js.UndefOr[Ref[_] | Null] = js.native
  
  /**
  		 * The time this `vnode` started rendering. Will only be set when
  		 * the devtools are attached.
  		 * Default value: `0`
  		 */
  var startTime: js.UndefOr[Double] = js.native
  
  var `type`: ComponentType[P] | String = js.native
}
object VNode {
  
  @scala.inline
  def apply[P](key: Key, props: P with Children, `type`: ComponentType[P] | String): VNode[P] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode[P]]
  }
  
  @scala.inline
  implicit class VNodeMutableBuilder[Self <: VNode[_], P] (val x: Self with VNode[P]) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: P with Children): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: Ref[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setType(value: ComponentType[P] | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
