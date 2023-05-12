package typings.postgres.mod

import typings.node.nodeColonstreamMod.Readable
import typings.node.nodeColonstreamMod.Writable
import typings.std.AsyncIterable
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingQueryModifiers[TRow /* <: js.Array[Any] */] extends StObject {
  
  def cancel(): Unit = js.native
  
  def cursor(): AsyncIterable[
    js.Array[
      NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: TRow[number] */ js.Any
      ]
    ]
  ] = js.native
  def cursor(
    cb: js.Function1[
      /* row */ js.Array[
        NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: TRow[number] */ js.Any
        ]
      ], 
      Unit
    ]
  ): js.Promise[
    ExecutionResult[
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[number] */ js.Any
    ]
  ] = js.native
  def cursor(rows: Double): AsyncIterable[
    js.Array[
      NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: TRow[number] */ js.Any
      ]
    ]
  ] = js.native
  def cursor(
    rows: Double,
    cb: js.Function1[
      /* rows */ js.Array[
        NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: TRow[number] */ js.Any
        ]
      ], 
      Unit
    ]
  ): js.Promise[
    ExecutionResult[
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[number] */ js.Any
    ]
  ] = js.native
  
  def execute(): this.type = js.native
  
  def forEach(
    cb: js.Function2[
      /* row */ NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: TRow[number] */ js.Any
      ], 
      /* result */ ExecutionResult[
        /* import warning: importer.ImportType#apply Failed type conversion: TRow[number] */ js.Any
      ], 
      Unit
    ]
  ): js.Promise[
    ExecutionResult[
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[number] */ js.Any
    ]
  ] = js.native
  
  def readable(): js.Promise[Readable] = js.native
  
  /**
    * @deprecated `.stream` has been renamed to `.forEach`
    * @throws
    */
  def stream(
    cb: js.Function2[
      /* row */ NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: TRow[number] */ js.Any
      ], 
      /* result */ ExecutionResult[
        /* import warning: importer.ImportType#apply Failed type conversion: TRow[number] */ js.Any
      ], 
      Unit
    ]
  ): scala.Nothing = js.native
  
  def writable(): js.Promise[Writable] = js.native
}
