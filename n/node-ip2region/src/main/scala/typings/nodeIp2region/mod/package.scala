package typings.nodeIp2region

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SearchCallback = js.Function2[
    /* err */ typings.node.NodeJS.ErrnoException, 
    /* result */ typings.nodeIp2region.mod.SearchResult, 
    scala.Unit
  ]
  
  type SearchResult = typings.nodeIp2region.anon.City | scala.Null
}
