package typings.pg

import typings.node.bufferMod.global.Buffer
import typings.pg.anon.FnCall
import typings.pg.mod.CustomTypesConfig
import typings.pg.pgStrings.binary
import typings.pg.pgStrings.text
import typings.pgTypes.mod.TypeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeOverridesMod {
  
  @JSImport("pg/lib/type-overrides", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with TypeOverrides {
    def this(types: CustomTypesConfig) = this()
    
    /* CompleteClass */
    override def getTypeParser[T](oid: Double): typings.pgTypes.mod.TypeParser[String, T | String] = js.native
    /* CompleteClass */
    override def getTypeParser[T](oid: TypeId): typings.pgTypes.mod.TypeParser[String, T | String] = js.native
    /* CompleteClass */
    @JSName("getTypeParser")
    var getTypeParser_Original: FnCall = js.native
    /* CompleteClass */
    @JSName("getTypeParser")
    override def getTypeParser_binary[T](oid: Double, format: binary): typings.pgTypes.mod.TypeParser[Buffer, T | String] = js.native
    /* CompleteClass */
    @JSName("getTypeParser")
    override def getTypeParser_binary[T](oid: TypeId, format: binary): typings.pgTypes.mod.TypeParser[Buffer, T | String] = js.native
    /* CompleteClass */
    @JSName("getTypeParser")
    override def getTypeParser_text[T](oid: Double, format: text): typings.pgTypes.mod.TypeParser[String, T | String] = js.native
    /* CompleteClass */
    @JSName("getTypeParser")
    override def getTypeParser_text[T](oid: TypeId, format: text): typings.pgTypes.mod.TypeParser[String, T | String] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pg.pgStrings.text
    - typings.pg.pgStrings.binary
  */
  trait TypeFormat extends StObject
  object TypeFormat {
    
    inline def binary: typings.pg.pgStrings.binary = "binary".asInstanceOf[typings.pg.pgStrings.binary]
    
    inline def text: typings.pg.pgStrings.text = "text".asInstanceOf[typings.pg.pgStrings.text]
  }
  
  @js.native
  trait TypeOverrides
    extends StObject
       with CustomTypesConfig {
    
    def getTypeParser(oid: Double, format: TypeFormat): TypeParser[Double, Any] = js.native
    
    def setTypeParser(oid: Double, fn: TypeParser[Double, Any]): Unit = js.native
    def setTypeParser(oid: Double, format: TypeFormat, fn: TypeParser[Double, Any]): Unit = js.native
  }
  
  type TypeParser[TOid, TReturn] = js.Function1[/* oid */ TOid, TReturn]
}
