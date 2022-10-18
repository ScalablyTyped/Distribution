package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatabaseQueryUtilitiesMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/database/QueryUtilities", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with QueryUtilities
  @JSImport("@nginstack/engine/lib/database/QueryUtilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): QueryUtilities = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[QueryUtilities]
  
  @js.native
  trait QueryUtilities extends StObject {
    
    def clauseWhere(prefixWhereAndOr: String, fieldName: String, operator: String, value: Any): String = js.native
    
    def clauseWhereOfChar(prefixWhereAndOr: String, columnName: String, value: String): String = js.native
    def clauseWhereOfChar(prefixWhereAndOr: String, columnName: String, value: String, negation: Boolean): String = js.native
    def clauseWhereOfChar(prefixWhereAndOr: String, columnName: String, value: js.Array[String]): String = js.native
    def clauseWhereOfChar(prefixWhereAndOr: String, columnName: String, value: js.Array[String], negation: Boolean): String = js.native
    
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: String,
      negation: Boolean,
      split: Boolean,
      operatorConcat: String,
      countKeysForSplit: Double,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: String,
      negation: Boolean,
      split: Boolean,
      operatorConcat: String,
      countKeysForSplit: Unit,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: String,
      negation: Boolean,
      split: Boolean,
      operatorConcat: Unit,
      countKeysForSplit: Double,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: String,
      negation: Boolean,
      split: Boolean,
      operatorConcat: Unit,
      countKeysForSplit: Unit,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: String,
      negation: Boolean,
      split: Unit,
      operatorConcat: String,
      countKeysForSplit: Double,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: String,
      negation: Boolean,
      split: Unit,
      operatorConcat: String,
      countKeysForSplit: Unit,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: String,
      negation: Boolean,
      split: Unit,
      operatorConcat: Unit,
      countKeysForSplit: Double,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: String,
      negation: Boolean,
      split: Unit,
      operatorConcat: Unit,
      countKeysForSplit: Unit,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: String,
      negation: Unit,
      split: Boolean,
      operatorConcat: String,
      countKeysForSplit: Double,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: String,
      negation: Unit,
      split: Boolean,
      operatorConcat: String,
      countKeysForSplit: Unit,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: String,
      negation: Unit,
      split: Boolean,
      operatorConcat: Unit,
      countKeysForSplit: Double,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: String,
      negation: Unit,
      split: Boolean,
      operatorConcat: Unit,
      countKeysForSplit: Unit,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: String,
      negation: Unit,
      split: Unit,
      operatorConcat: String,
      countKeysForSplit: Double,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: String,
      negation: Unit,
      split: Unit,
      operatorConcat: String,
      countKeysForSplit: Unit,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: String,
      negation: Unit,
      split: Unit,
      operatorConcat: Unit,
      countKeysForSplit: Double,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: String,
      negation: Unit,
      split: Unit,
      operatorConcat: Unit,
      countKeysForSplit: Unit,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: Double,
      negation: Boolean,
      split: Boolean,
      operatorConcat: String,
      countKeysForSplit: Double,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: Double,
      negation: Boolean,
      split: Boolean,
      operatorConcat: String,
      countKeysForSplit: Unit,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: Double,
      negation: Boolean,
      split: Boolean,
      operatorConcat: Unit,
      countKeysForSplit: Double,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: Double,
      negation: Boolean,
      split: Boolean,
      operatorConcat: Unit,
      countKeysForSplit: Unit,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: Double,
      negation: Boolean,
      split: Unit,
      operatorConcat: String,
      countKeysForSplit: Double,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: Double,
      negation: Boolean,
      split: Unit,
      operatorConcat: String,
      countKeysForSplit: Unit,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: Double,
      negation: Boolean,
      split: Unit,
      operatorConcat: Unit,
      countKeysForSplit: Double,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: Double,
      negation: Boolean,
      split: Unit,
      operatorConcat: Unit,
      countKeysForSplit: Unit,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: Double,
      negation: Unit,
      split: Boolean,
      operatorConcat: String,
      countKeysForSplit: Double,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: Double,
      negation: Unit,
      split: Boolean,
      operatorConcat: String,
      countKeysForSplit: Unit,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: Double,
      negation: Unit,
      split: Boolean,
      operatorConcat: Unit,
      countKeysForSplit: Double,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: Double,
      negation: Unit,
      split: Boolean,
      operatorConcat: Unit,
      countKeysForSplit: Unit,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: Double,
      negation: Unit,
      split: Unit,
      operatorConcat: String,
      countKeysForSplit: Double,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: Double,
      negation: Unit,
      split: Unit,
      operatorConcat: String,
      countKeysForSplit: Unit,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: Double,
      negation: Unit,
      split: Unit,
      operatorConcat: Unit,
      countKeysForSplit: Double,
      args: Any*
    ): String = js.native
    def clauseWhereOfKeys(
      prefixWhereAndOr: String,
      fieldName: String,
      keys: Double,
      negation: Unit,
      split: Unit,
      operatorConcat: Unit,
      countKeysForSplit: Unit,
      args: Any*
    ): String = js.native
    
    def clauseWhereOfStrings(prefixWhereAndOr: String, columnName: String, value: String): String = js.native
    def clauseWhereOfStrings(prefixWhereAndOr: String, columnName: String, value: String, negation: Boolean): String = js.native
    def clauseWhereOfStrings(prefixWhereAndOr: String, columnName: String, value: js.Array[String]): String = js.native
    def clauseWhereOfStrings(prefixWhereAndOr: String, columnName: String, value: js.Array[String], negation: Boolean): String = js.native
    
    var maxInOperatorListLength: Double = js.native
  }
}
