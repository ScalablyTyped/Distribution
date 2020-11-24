package typings.nodeFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BlobPart = typings.std.ArrayBuffer | typings.std.ArrayBufferView | typings.nodeFetch.mod.Blob | java.lang.String
  
  type BodyInit = typings.std.ArrayBuffer | typings.std.ArrayBufferView | typings.node.NodeJS.ReadableStream | java.lang.String | typings.node.urlMod.URLSearchParams | typings.formData.mod.^ 
  
  type HeaderInit = typings.nodeFetch.mod.HeadersInit
  
  type HeadersInit = typings.nodeFetch.mod.Headers | js.Array[js.Array[java.lang.String]] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.nodeFetch.mod.URLLike
    - typings.nodeFetch.mod.Request
  */
  type RequestInfo = typings.nodeFetch.mod._RequestInfo | java.lang.String
}
