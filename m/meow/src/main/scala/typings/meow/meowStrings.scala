package typings.meow

import typings.meow.mod.FlagType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meowStrings {
  
  @js.native
  sealed trait TypedFlags extends StObject
  inline def TypedFlags: TypedFlags = "TypedFlags".asInstanceOf[TypedFlags]
  
  @js.native
  sealed trait boolean
    extends StObject
       with FlagType
  inline def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait number
    extends StObject
       with FlagType
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait string
    extends StObject
       with FlagType
  inline def string: string = "string".asInstanceOf[string]
}
