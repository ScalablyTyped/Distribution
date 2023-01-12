package typings.npmName

import typings.std.Error
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("npm-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(name: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def default(name: String, options: Options): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("npm-name", "InvalidNameError")
  @js.native
  open class InvalidNameError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def npmNameMany[NameType /* <: String */](names: js.Array[NameType]): js.Promise[Map[NameType, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("npmNameMany")(names.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Map[NameType, Boolean]]]
  inline def npmNameMany[NameType /* <: String */](names: js.Array[NameType], options: Options): js.Promise[Map[NameType, Boolean]] = (^.asInstanceOf[js.Dynamic].applyDynamic("npmNameMany")(names.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[NameType, Boolean]]]
  
  trait Options extends StObject {
    
    /**
    	Registry URL to check name availability against.
    	Default: User's configured npm registry URL.
    	*/
    val registryUrl: String
  }
  object Options {
    
    inline def apply(registryUrl: String): Options = {
      val __obj = js.Dynamic.literal(registryUrl = registryUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setRegistryUrl(value: String): Self = StObject.set(x, "registryUrl", value.asInstanceOf[js.Any])
    }
  }
}
