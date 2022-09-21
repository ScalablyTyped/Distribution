package typings.photoshop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("photoshop/dom/Actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("photoshop/dom/Actions", "Action")
  @js.native
  open class Action protected () extends StObject {
    /**
      * @ignore
      */
    def this(id: Double) = this()
    
    /**
      * Deletes this action from the actions panel
      *
      */
    def delete(): Unit = js.native
    
    /**
      * Creates a copy of this action, placing it in the same action set
      */
    def duplicate(): Action = js.native
    
    /**
      * The internal ID of this action
      *
      * Can be used for batchPlay calls, used internally
      */
    def id: Double = js.native
    
    /**
      * 0-index of this action in it's parent action set
      */
    def index: Double = js.native
    
    /**
      * The name of this action, displayed in the panel
      * Cannot be changed
      */
    def name: String = js.native
    /**
      * Renames the action set
      */
    def name_=(name: String): Unit = js.native
    
    /**
      * The action set this action belongs to
      */
    def parent: ActionSet = js.native
    
    /**
      * Plays this action
      *
      * @async
      */
    def play(): js.Promise[Unit] = js.native
    
    /**
      * The class name of the referenced Action object
      */
    def typename: String = js.native
  }
  
  @JSImport("photoshop/dom/Actions", "ActionSet")
  @js.native
  open class ActionSet protected () extends StObject {
    /**
      * @ignore
      */
    def this(id: Any) = this()
    
    /**
      * List of actions in this action set
      */
    def actions: js.Array[Action] = js.native
    
    /**
      * Deletes this action set from the actions panel
      */
    def delete(): Unit = js.native
    
    /**
      * Creates a copy of this action set
      */
    def duplicate(): ActionSet = js.native
    
    /**
      * The internal ID of this Action Set
      * Can be used for batchPlay calls, used internally
      */
    def id: Double = js.native
    
    /**
      * 0-index of this action set in the actions palette
      */
    def index: Double = js.native
    
    /**
      * The name of this action set, displayed in the panel
      */
    def name: String = js.native
    /**
      * Renames the action set
      */
    def name_=(name: String): Unit = js.native
    
    /**
      * Plays all actions in this set one by one
      *
      * @async
      */
    def play(): js.Promise[Unit] = js.native
    
    /**
      * The class name of the referenced ActionSet object
      */
    def typename: String = js.native
  }
  
  inline def PSAction(id: Double): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("PSAction")(id.asInstanceOf[js.Any]).asInstanceOf[Action]
  
  inline def PSActionSet(id: Double): ActionSet = ^.asInstanceOf[js.Dynamic].applyDynamic("PSActionSet")(id.asInstanceOf[js.Any]).asInstanceOf[ActionSet]
  
  inline def validateActionSet(actionSet: ActionSet): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateActionSet")(actionSet.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
