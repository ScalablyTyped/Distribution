package typings.peculiarAsn1Schema

import typings.peculiarAsn1Schema.buildTypesDecoratorsMod.AsnRepeatTypeString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peculiarAsn1SchemaStrings {
  
  @js.native
  sealed trait sequence
    extends StObject
       with AsnRepeatTypeString
  inline def sequence: sequence = "sequence".asInstanceOf[sequence]
  
  @js.native
  sealed trait set
    extends StObject
       with AsnRepeatTypeString
  inline def set: set = "set".asInstanceOf[set]
}
