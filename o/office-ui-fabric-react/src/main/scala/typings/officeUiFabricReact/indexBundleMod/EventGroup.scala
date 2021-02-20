package typings.officeUiFabricReact.indexBundleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "EventGroup")
@js.native
class EventGroup protected ()
  extends typings.officeUiFabricReact.mod.EventGroup {
  /** parent: the context in which events attached to non-HTMLElements are called */
  def this(parent: js.Any) = this()
}
/* static members */
object EventGroup {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "EventGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "EventGroup._isElement")
  @js.native
  def _isElement: js.Any = js.native
  @scala.inline
  def _isElement_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_isElement")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "EventGroup._uniqueId")
  @js.native
  def _uniqueId: js.Any = js.native
  @scala.inline
  def _uniqueId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_uniqueId")(x.asInstanceOf[js.Any])
  
  /** Check to see if the target has declared support of the given event. */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "EventGroup.isDeclared")
  @js.native
  def isDeclared(target: js.Any, eventName: String): Boolean = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "EventGroup.isObserved")
  @js.native
  def isObserved(target: js.Any, eventName: String): Boolean = js.native
  
  /** For IE8, bubbleEvent is ignored here and must be dealt with by the handler.
    *  Events raised here by default have bubbling set to false and cancelable set to true.
    *  This applies also to built-in events being raised manually here on HTMLElements,
    *  which may lead to unexpected behavior if it differs from the defaults.
    *
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "EventGroup.raise")
  @js.native
  def raise(target: js.Any, eventName: String): js.UndefOr[Boolean] = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "EventGroup.raise")
  @js.native
  def raise(target: js.Any, eventName: String, eventArgs: js.UndefOr[scala.Nothing], bubbleEvent: Boolean): js.UndefOr[Boolean] = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "EventGroup.raise")
  @js.native
  def raise(target: js.Any, eventName: String, eventArgs: js.Any): js.UndefOr[Boolean] = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "EventGroup.raise")
  @js.native
  def raise(target: js.Any, eventName: String, eventArgs: js.Any, bubbleEvent: Boolean): js.UndefOr[Boolean] = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "EventGroup.stopPropagation")
  @js.native
  def stopPropagation(event: js.Any): Unit = js.native
}
