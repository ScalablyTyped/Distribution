package typings.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object othersTypesMod {
  
  type Sql = js.Function2[
    /* sqlStr */ String, 
    /* args */ js.UndefOr[StringDictionary[Name | Value]], 
    String | js.Array[String]
  ]
}
