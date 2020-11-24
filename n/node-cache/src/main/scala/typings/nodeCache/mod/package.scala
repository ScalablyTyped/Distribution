package typings.nodeCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[T] = js.Function2[/* err */ js.Any, /* data */ js.UndefOr[T], scala.Unit]
  
  type Data = org.scalablytyped.runtime.StringDictionary[typings.nodeCache.mod.WrappedValue[js.Any]]
  
  /**
  	 * Since 4.1.0: Key-validation: The keys can be given as either string or number,
  	 * but are casted to a string internally anyway.
  	 */
  type Key = java.lang.String | scala.Double
}
