package typings.next

import typings.next.anon.Create
import typings.next.anon.Typescript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerNextTypescriptMod {
  
  @JSImport("next/dist/server/next-typescript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTSPlugin(modules: Typescript): Create = ^.asInstanceOf[js.Dynamic].applyDynamic("createTSPlugin")(modules.asInstanceOf[js.Any]).asInstanceOf[Create]
}
