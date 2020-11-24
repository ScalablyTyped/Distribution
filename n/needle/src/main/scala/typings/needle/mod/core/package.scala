package typings.needle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object core {
  
  type BodyData = typings.node.Buffer | typings.needle.mod.core.KeyValue | typings.node.NodeJS.ReadableStream | java.lang.String | scala.Null
  
  type Cookies = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type KeyValue = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type NeedleCallback = js.Function3[
    /* error */ typings.std.Error | scala.Null, 
    /* response */ typings.needle.mod.core.NeedleResponse, 
    /* body */ js.Any, 
    scala.Unit
  ]
  
  type NeedleOptions = typings.needle.mod.core.RequestOptions with typings.needle.mod.core.ResponseOptions with typings.needle.mod.core.RedirectOptions with typings.node.httpsMod.RequestOptions
  
  type ReadableStream = typings.node.NodeJS.ReadableStream
}
