package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackagedBundle
  extends StObject
     with NamedBundle {
  
  /** The absolute file path of the written bundle, including the final content hash if any. */
  val filePath: FilePath = js.native
  
  /** Statistics about the bundle. */
  val stats: Stats = js.native
}
