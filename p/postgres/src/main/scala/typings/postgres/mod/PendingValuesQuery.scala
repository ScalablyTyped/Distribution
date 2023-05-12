package typings.postgres.mod

import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingValuesQuery[TRow /* <: js.Array[MaybeRow] */]
  extends StObject
     with Promise[ValuesRowList[TRow]]
     with PendingQueryModifiers[
      js.Array[
        js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: TRow[number][keyof TRow[number]] */ js.Any
        ]
      ]
    ] {
  
  def describe(): js.Promise[Statement] = js.native
}
