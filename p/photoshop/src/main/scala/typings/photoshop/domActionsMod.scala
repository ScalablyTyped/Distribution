package typings.photoshop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domActionsMod {
  
  @JSImport("photoshop/dom/Actions", "Action")
  @js.native
  open class Action protected () extends StObject {
    /**
      * @ignore
      */
    def this(id: Double) = this()
    
    /**
      * Deletes this Action from the Actions panel
      *
      * @minVersion 22.1
      */
    def delete(): Unit = js.native
    
    /**
      * Creates a copy of this Action, placing it in the same Action Set
      *
      * @minVersion 22.1
      */
    def duplicate(): Action = js.native
    
    /**
      * The internal ID of this Action
      * Can be used for batchPlay calls, used internally
      *
      * @minVersion 22.1
      */
    def id: Double = js.native
    
    /**
      * Zero-based index of this Action in it's parent Action Set
      *
      * @minVersion 22.1
      */
    def index: Double = js.native
    
    /**
      * The name of this Action, displayed in the panel
      * Cannot be changed
      *
      * @minVersion 22.1
      */
    def name: String = js.native
    /**
      * Renames the Action Set
      *
      * @minVersion 22.1
      */
    def name_=(name: String): Unit = js.native
    
    /**
      * The Action Set this Action belongs to
      *
      * @minVersion 22.1
      */
    def parent: ActionSet = js.native
    
    /**
      * Plays this Action
      *
      * @async
      * @minVersion 22.1
      */
    def play(): js.Promise[Unit] = js.native
    
    /**
      * The class name of the referenced object: *"Action"*.
      *
      * @minVersion 23.0
      */
    def typename: typings.photoshop.photoshopStrings.Action = js.native
  }
  
  @JSImport("photoshop/dom/Actions", "ActionSet")
  @js.native
  open class ActionSet protected () extends StObject {
    /**
      * @ignore
      */
    def this(id: Any) = this()
    
    /**
      * List of Actions in this Action Set
      *
      * @minVersion 22.1
      */
    def actions: js.Array[Action] = js.native
    
    /**
      * Deletes this Action Set from the Actions panel
      *
      * @minVersion 22.1
      */
    def delete(): Unit = js.native
    
    /**
      * Creates a copy of this Action Set
      *
      * @minVersion 22.1
      */
    def duplicate(): ActionSet = js.native
    
    /**
      * The internal ID of this Action Set
      * Can be used for batchPlay calls, used internally
      *
      * @minVersion 22.1
      */
    def id: Double = js.native
    
    /**
      * Zero-based index of this Action Set in the Actions palette
      *
      * @minVersion 22.1
      */
    def index: Double = js.native
    
    /**
      * The name of this Action Set, displayed in the panel
      *
      * @minVersion 22.1
      */
    def name: String = js.native
    /**
      * Renames the Action Set
      *
      * @minVersion 22.1
      */
    def name_=(name: String): Unit = js.native
    
    /**
      * Plays all Actions in this set one by one
      *
      * @async
      * @minVersion 22.1
      */
    def play(): js.Promise[Unit] = js.native
    
    /**
      * The class name of the referenced object: *"ActionSet"*.
      *
      * @minVersion 23.0
      */
    def typename: typings.photoshop.photoshopStrings.ActionSet = js.native
  }
}
