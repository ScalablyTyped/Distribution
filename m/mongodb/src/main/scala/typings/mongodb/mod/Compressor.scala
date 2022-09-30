package typings.mongodb.mod

import typings.mongodb.mongodbInts.`0`
import typings.mongodb.mongodbInts.`1`
import typings.mongodb.mongodbInts.`2`
import typings.mongodb.mongodbInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mongodbInts.`0`
  - typings.mongodb.mongodbInts.`1`
  - typings.mongodb.mongodbInts.`2`
  - typings.mongodb.mongodbInts.`3`
*/
trait Compressor extends StObject
/* Inlined std.Readonly<{ readonly none :0,  readonly snappy :1,  readonly zlib :2,  readonly zstd :3}> */
object Compressor {
  
  @JSImport("mongodb", "Compressor.none")
  @js.native
  val none: `0` = js.native
  
  @JSImport("mongodb", "Compressor.snappy")
  @js.native
  val snappy: `1` = js.native
  
  @JSImport("mongodb", "Compressor.zlib")
  @js.native
  val zlib: `2` = js.native
  
  @JSImport("mongodb", "Compressor.zstd")
  @js.native
  val zstd: `3` = js.native
}
