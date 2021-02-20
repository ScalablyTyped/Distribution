package typings.playable

import typings.playable.typesMod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createContainerMod {
  
  @JSImport("playable/dist/src/core/dependency-container/createContainer", JSImport.Default)
  @js.native
  def default(): Container = js.native
  @JSImport("playable/dist/src/core/dependency-container/createContainer", JSImport.Default)
  @js.native
  def default(options: js.UndefOr[scala.Nothing], __parentContainer: Container): Container = js.native
  @JSImport("playable/dist/src/core/dependency-container/createContainer", JSImport.Default)
  @js.native
  def default(options: IOptions): Container = js.native
  @JSImport("playable/dist/src/core/dependency-container/createContainer", JSImport.Default)
  @js.native
  def default(options: IOptions, __parentContainer: Container): Container = js.native
  
  @JSImport("playable/dist/src/core/dependency-container/createContainer", "Container")
  @js.native
  class Container () extends StObject {
    def this(options: IOptions) = this()
    def this(options: js.UndefOr[scala.Nothing], _parentContainer: Container) = this()
    def this(options: IOptions, _parentContainer: Container) = this()
    
    var _parentContainer: js.Any = js.native
    
    var _registerAs: js.Any = js.native
    
    var _registrations: js.Any = js.native
    
    var _resolutionStack: js.Any = js.native
    
    var cache: js.Any = js.native
    
    def createScope(): Container = js.native
    
    var options: IOptions = js.native
    
    def register(name: String): Container = js.native
    def register(name: String, registration: js.Any): Container = js.native
    def register(name: js.Object): Container = js.native
    def register(name: js.Object, registration: js.Any): Container = js.native
    
    def registerClass(name: String): Container = js.native
    def registerClass(name: String, value: js.UndefOr[scala.Nothing], options: IOptions): Container = js.native
    def registerClass(name: String, value: js.Any): Container = js.native
    def registerClass(name: String, value: js.Any, options: IOptions): Container = js.native
    def registerClass(name: js.Object): Container = js.native
    def registerClass(name: js.Object, value: js.UndefOr[scala.Nothing], options: IOptions): Container = js.native
    def registerClass(name: js.Object, value: js.Any): Container = js.native
    def registerClass(name: js.Object, value: js.Any, options: IOptions): Container = js.native
    
    def registerFunction(name: String): Container = js.native
    def registerFunction(name: String, value: js.UndefOr[scala.Nothing], options: IOptions): Container = js.native
    def registerFunction(name: String, value: js.Any): Container = js.native
    def registerFunction(name: String, value: js.Any, options: IOptions): Container = js.native
    def registerFunction(name: js.Object): Container = js.native
    def registerFunction(name: js.Object, value: js.UndefOr[scala.Nothing], options: IOptions): Container = js.native
    def registerFunction(name: js.Object, value: js.Any): Container = js.native
    def registerFunction(name: js.Object, value: js.Any, options: IOptions): Container = js.native
    
    def registerValue(name: String): Container = js.native
    def registerValue(name: String, value: js.UndefOr[scala.Nothing], options: IOptions): Container = js.native
    def registerValue(name: String, value: js.Any): Container = js.native
    def registerValue(name: String, value: js.Any, options: IOptions): Container = js.native
    def registerValue(name: js.Object): Container = js.native
    def registerValue(name: js.Object, value: js.UndefOr[scala.Nothing], options: IOptions): Container = js.native
    def registerValue(name: js.Object, value: js.Any): Container = js.native
    def registerValue(name: js.Object, value: js.Any, options: IOptions): Container = js.native
    
    def registrations: js.Any = js.native
    
    def resolve(name: String): js.Any = js.native
  }
}
