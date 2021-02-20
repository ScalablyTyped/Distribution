package typings.pg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ConnectionConfig = typings.pg.mod.ClientConfig
  
  type QueryResultRow = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  @scala.inline
  def defaults: typings.pg.mod.Defaults_ with typings.pg.mod.ClientConfig = typings.pg.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaults").asInstanceOf[typings.pg.mod.Defaults_ with typings.pg.mod.ClientConfig]
  
  @scala.inline
  def native: typings.pg.anon.TypeofPg | scala.Null = typings.pg.mod.^.asInstanceOf[js.Dynamic].selectDynamic("native").asInstanceOf[typings.pg.anon.TypeofPg | scala.Null]
}
