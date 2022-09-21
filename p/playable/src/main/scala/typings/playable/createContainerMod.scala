package typings.playable

import typings.playable.typesMod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createContainerMod {
  
  @JSImport("playable/dist/src/core/dependency-container/createContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Container = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Container]
  inline def default(options: Unit, __parentContainer: Container): Container = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], __parentContainer.asInstanceOf[js.Any])).asInstanceOf[Container]
  inline def default(options: IOptions): Container = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Container]
  inline def default(options: IOptions, __parentContainer: Container): Container = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], __parentContainer.asInstanceOf[js.Any])).asInstanceOf[Container]
  
  @JSImport("playable/dist/src/core/dependency-container/createContainer", "Container")
  @js.native
  open class Container () extends StObject {
    def this(options: IOptions) = this()
    def this(options: Unit, _parentContainer: Container) = this()
    def this(options: IOptions, _parentContainer: Container) = this()
    
    /* private */ var _parentContainer: Any = js.native
    
    /* private */ var _registerAs: Any = js.native
    
    /* private */ var _registrations: Any = js.native
    
    /* private */ var _resolutionStack: Any = js.native
    
    var cache: Any = js.native
    
    def createScope(): Container = js.native
    
    var options: IOptions = js.native
    
    def register(name: String): Container = js.native
    def register(name: String, registration: Any): Container = js.native
    def register(name: js.Object): Container = js.native
    def register(name: js.Object, registration: Any): Container = js.native
    
    def registerClass(name: String): Container = js.native
    def registerClass(name: String, value: Any): Container = js.native
    def registerClass(name: String, value: Any, options: IOptions): Container = js.native
    def registerClass(name: String, value: Unit, options: IOptions): Container = js.native
    def registerClass(name: js.Object): Container = js.native
    def registerClass(name: js.Object, value: Any): Container = js.native
    def registerClass(name: js.Object, value: Any, options: IOptions): Container = js.native
    def registerClass(name: js.Object, value: Unit, options: IOptions): Container = js.native
    
    def registerFunction(name: String): Container = js.native
    def registerFunction(name: String, value: Any): Container = js.native
    def registerFunction(name: String, value: Any, options: IOptions): Container = js.native
    def registerFunction(name: String, value: Unit, options: IOptions): Container = js.native
    def registerFunction(name: js.Object): Container = js.native
    def registerFunction(name: js.Object, value: Any): Container = js.native
    def registerFunction(name: js.Object, value: Any, options: IOptions): Container = js.native
    def registerFunction(name: js.Object, value: Unit, options: IOptions): Container = js.native
    
    def registerValue(name: String): Container = js.native
    def registerValue(name: String, value: Any): Container = js.native
    def registerValue(name: String, value: Any, options: IOptions): Container = js.native
    def registerValue(name: String, value: Unit, options: IOptions): Container = js.native
    def registerValue(name: js.Object): Container = js.native
    def registerValue(name: js.Object, value: Any): Container = js.native
    def registerValue(name: js.Object, value: Any, options: IOptions): Container = js.native
    def registerValue(name: js.Object, value: Unit, options: IOptions): Container = js.native
    
    def registrations: Any = js.native
    
    def resolve(name: String): Any = js.native
  }
}
