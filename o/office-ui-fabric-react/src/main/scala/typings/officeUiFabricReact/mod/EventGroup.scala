package typings.officeUiFabricReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "EventGroup")
@js.native
class EventGroup protected ()
  extends typings.officeUiFabricReact.utilitiesMod.EventGroup {
  /** parent: the context in which events attached to non-HTMLElements are called */
  def this(parent: js.Any) = this()
}
/* static members */
object EventGroup {
  
  @JSImport("office-ui-fabric-react", "EventGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "EventGroup._isElement")
  @js.native
  def _isElement: js.Any = js.native
  inline def _isElement_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_isElement")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react", "EventGroup._uniqueId")
  @js.native
  def _uniqueId: js.Any = js.native
  inline def _uniqueId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_uniqueId")(x.asInstanceOf[js.Any])
  
  /** Check to see if the target has declared support of the given event. */
  inline def isDeclared(target: js.Any, eventName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeclared")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isObserved(target: js.Any, eventName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObserved")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** For IE8, bubbleEvent is ignored here and must be dealt with by the handler.
    *  Events raised here by default have bubbling set to false and cancelable set to true.
    *  This applies also to built-in events being raised manually here on HTMLElements,
    *  which may lead to unexpected behavior if it differs from the defaults.
    *
    */
  inline def raise(target: js.Any, eventName: String): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("raise")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def raise(target: js.Any, eventName: String, eventArgs: js.Any): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("raise")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventArgs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def raise(target: js.Any, eventName: String, eventArgs: js.Any, bubbleEvent: Boolean): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("raise")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventArgs.asInstanceOf[js.Any], bubbleEvent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def raise(target: js.Any, eventName: String, eventArgs: Unit, bubbleEvent: Boolean): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("raise")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventArgs.asInstanceOf[js.Any], bubbleEvent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def stopPropagation(event: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPropagation")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
