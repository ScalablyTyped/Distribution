package typings.pgPromise.pgSubsetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Interface of 'pg-types' module;
// See: https://github.com/brianc/node-pg-types
@js.native
trait ITypes
  extends StObject
     with ITypeOverrides {
  
  def arrayParser(source: String, transform: js.Function1[/* entry */ Any, Any]): js.Array[Any] = js.native
  
  var builtins: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TypeId */ Any = js.native
}
