package typings.namespaceJs

import typings.namespaceJs.mod.NamespaceJs.Definition
import typings.namespaceJs.mod.NamespaceJs.Fqn
import typings.namespaceJs.mod.NamespaceJs.UserObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Namespace {
    
    @JSGlobal("Namespace.apply")
    @js.native
    val apply: js.Function1[/* callback */ js.Function1[/* ns */ js.Object, Unit], Unit] = js.native
    
    object global {
      
      // eslint-disable-next-line no-unnecessary-generics
      inline def Namespace[T /* <: UserObject */](fqn: Fqn): Definition[T] = js.Dynamic.global.applyDynamic("Namespace")(fqn.asInstanceOf[js.Any]).asInstanceOf[Definition[T]]
    }
    
    @JSGlobal("Namespace.use")
    @js.native
    val use: js.Function1[
        /* syntax */ Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: any extends / * template literal string: ${Fqn} ${ImportName} * / string ? namespace-js.namespace-js.NamespaceJs.Application<{} & namespace-js.namespace-js.NamespaceJs.UserObject> : any extends string ? namespace-js.namespace-js.NamespaceJs.Application<namespace-js.namespace-js.NamespaceJs.DotUserObject<any, {} & namespace-js.namespace-js.NamespaceJs.UserObject>> : never */ js.Any
      ] = js.native
  }
}
