package typings.nodeSql2.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Queryable[T] extends Executable {
  
  def delete(): ModifyingQuery = js.native
  
  def select(star: Column[Unit, Unit]): Query[T] = js.native
  def select[U](nodesOrTables: js.Any*): Query[U] = js.native
  def select[N1 /* <: String */, T1, N2 /* <: String */, T2](n1: Column[N1, T1], n2: Column[N2, T2]): Query[typings.nodeSql2.nodeSql2Strings.Queryable with TopLevel[js.Any]] = js.native
  def select[N1 /* <: String */, T1, N2 /* <: String */, T2, N3 /* <: String */, T3](n1: Column[N1, T1], n2: Column[N2, T2], n3: Column[N3, T3]): Query[typings.nodeSql2.nodeSql2Strings.Queryable with TopLevel[js.Any]] = js.native
  @JSName("select")
  def select_N1_StringT1[N1 /* <: String */, T1](n1: Column[N1, T1]): Query[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ N in N1 ]: T1}
    */ typings.nodeSql2.nodeSql2Strings.Queryable with TopLevel[js.Any]
  ] = js.native
  
  def where(nodes: js.Any*): Query[T] = js.native
}
