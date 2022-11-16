package typings.pgPromise.mod

import typings.pgPromise.typescriptPgSubsetMod.IResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResultExt[T]
  extends StObject
     with IResult[T] {
  
  // Property 'duration' exists only in the following context:
  //  - for single-query events 'receive'
  //  - for method Database.result
  var duration: js.UndefOr[Double] = js.native
}
