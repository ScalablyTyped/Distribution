package typings.nginstackEngine

import typings.nginstackEngine.anon.OpenParameters
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeMod {
  
  inline def apply(opt_routeSet: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(opt_routeSet.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/router/Route", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Route {
    def this(opt_routeSet: Any) = this()
  }
  @JSImport("@nginstack/engine/lib/router/Route", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseAction(action: String): OpenParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAction")(action.asInstanceOf[js.Any]).asInstanceOf[OpenParameters]
  
  @JSImport("@nginstack/engine/lib/router/Route", "resolveGlobalParameter")
  @js.native
  val resolveGlobalParameter: Any = js.native
  
  inline def testScope(scope: String, requiredScope: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testScope")(scope.asInstanceOf[js.Any], requiredScope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def testScope(scope: String, requiredScope: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testScope")(scope.asInstanceOf[js.Any], requiredScope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def testScope(scope: js.Array[String], requiredScope: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testScope")(scope.asInstanceOf[js.Any], requiredScope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def testScope(scope: js.Array[String], requiredScope: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testScope")(scope.asInstanceOf[js.Any], requiredScope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @js.native
  trait Route extends StObject {
    
    /* private */ var action_ : Any = js.native
    
    def assign(`def`: typings.nginstackEngine.routeDefMod.^): Unit = js.native
    def assign(`def`: Record[Any, Any]): Unit = js.native
    
    /* private */ var dynamicRegExp_ : Any = js.native
    
    /* private */ var matcher_ : Any = js.native
    
    /* private */ var paramRegExp_ : Any = js.native
    
    var parameterNames: js.Array[String] = js.native
    
    /* private */ var pathParameters_ : Any = js.native
    
    /* private */ var propertiesToAssign_ : Any = js.native
    
    /* private */ var routeSet_ : Any = js.native
    
    def testScope(scope: String): Boolean = js.native
    
    /* private */ var typeRegExp_ : Any = js.native
    
    /* private */ var updateMatcher_ : Any = js.native
  }
}
