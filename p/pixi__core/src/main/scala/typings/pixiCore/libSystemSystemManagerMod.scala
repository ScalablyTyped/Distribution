package typings.pixiCore

import org.scalablytyped.runtime.StringDictionary
import typings.pixiCore.libSystemIsystemMod.ISystemConstructor
import typings.pixiRunner.mod.Runner
import typings.pixiUtils.mod.EventEmitter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSystemSystemManagerMod {
  
  @JSImport("@pixi/core/lib/system/SystemManager", "SystemManager")
  @js.native
  open class SystemManager[R] ()
    extends EventEmitter[String | js.Symbol, Any] {
    
    /* private */ var _systemsHash: Any = js.native
    
    /**
      * Create a bunch of runners based of a collection of ids
      * @param runnerIds - the runner ids to add
      */
    def addRunners(runnerIds: String*): Unit = js.native
    
    /**
      * Add a new system to the renderer.
      * @param ClassRef - Class reference
      * @param name - Property name for system, if not specified
      *        will use a static `name` property on the class itself. This
      *        name will be assigned as s property on the Renderer so make
      *        sure it doesn't collide with properties on Renderer.
      * @returns Return instance of renderer
      */
    def addSystem(ClassRef: ISystemConstructor[R], name: String): this.type = js.native
    
    /** destroy the all runners and systems. Its apps job to */
    def destroy(): Unit = js.native
    
    /**
      * A function that will run a runner and call the runners function but pass in different options
      * to each system based on there name.
      *
      * E.g. If you have two systems added called `systemA` and `systemB` you could call do the following:
      *
      * ```js
      * system.emitWithCustomOptions(init, {
      *     systemA: {...optionsForA},
      *     systemB: {...optionsForB},
      * });
      * ```
      *
      * `init` would be called on system A passing `optionsForA` and on system B passing `optionsForB`.
      * @param runner - the runner to target
      * @param options - key value options for each system
      */
    def emitWithCustomOptions(runner: Runner, options: Record[String, Any]): Unit = js.native
    
    /** a collection of runners defined by the user */
    val runners: StringDictionary[Runner] = js.native
    
    /**
      * Set up a system with a collection of SystemClasses and runners.
      * Systems are attached dynamically to this class when added.
      * @param config - the config for the system manager
      */
    def setup(config: ISystemConfig[R]): Unit = js.native
  }
  
  trait ISystemConfig[R] extends StObject {
    
    var priority: js.Array[String]
    
    var runners: js.Array[String]
    
    var systems: Record[String, ISystemConstructor[R]]
  }
  object ISystemConfig {
    
    inline def apply[R](
      priority: js.Array[String],
      runners: js.Array[String],
      systems: Record[String, ISystemConstructor[R]]
    ): ISystemConfig[R] = {
      val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], runners = runners.asInstanceOf[js.Any], systems = systems.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISystemConfig[R]]
    }
    
    extension [Self <: ISystemConfig[?], R](x: Self & ISystemConfig[R]) {
      
      inline def setPriority(value: js.Array[String]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityVarargs(value: String*): Self = StObject.set(x, "priority", js.Array(value*))
      
      inline def setRunners(value: js.Array[String]): Self = StObject.set(x, "runners", value.asInstanceOf[js.Any])
      
      inline def setRunnersVarargs(value: String*): Self = StObject.set(x, "runners", js.Array(value*))
      
      inline def setSystems(value: Record[String, ISystemConstructor[R]]): Self = StObject.set(x, "systems", value.asInstanceOf[js.Any])
    }
  }
}
