package typings.mysql2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type authPlugins = js.Function1[
    /* pluginMetadata */ typings.mysql2.anon.Command, 
    js.Function1[/* pluginData */ typings.node.Buffer, js.Promise[java.lang.String]]
  ]
}
