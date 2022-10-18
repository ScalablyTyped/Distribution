package typings.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typings.nodePgMigrate.distOperationsGeneralTypesMod.Name
import typings.nodePgMigrate.distOperationsGeneralTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsOthersTypesMod {
  
  @js.native
  trait Sql extends StObject {
    
    def apply(sqlStr: String): String | js.Array[String] = js.native
    def apply(sqlStr: String, args: StringDictionary[Name | Value]): String | js.Array[String] = js.native
  }
}
