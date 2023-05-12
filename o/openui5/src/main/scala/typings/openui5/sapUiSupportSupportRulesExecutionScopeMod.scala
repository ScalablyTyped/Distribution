package typings.openui5

import typings.openui5.anon.Cloned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiSupportSupportRulesExecutionScopeMod {
  
  @JSImport("sap/ui/support/supportRules/ExecutionScope", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ExecutionScope
  
  @js.native
  trait ExecutionScope extends StObject {
    
    /**
      *
      * @returns Array of matched elements
      */
    def getElements(/**
      * Object with specific filtering options
      */
    oConfig: Cloned): js.Array[Any] = js.native
    
    /**
      * Gets elements by their type
      *
      * @returns Array of matched elements
      */
    def getElementsByClassName(
      /**
      * Either string or function to be used when selecting a subset of elements
      */
    classNameSelector: String
    ): js.Array[Any] = js.native
    def getElementsByClassName(
      /**
      * Either string or function to be used when selecting a subset of elements
      */
    classNameSelector: js.Function
    ): js.Array[Any] = js.native
    
    /**
      * Gets the logged objects by object type
      *
      * @returns Array of logged objects
      */
    def getLoggedObjects(/**
      * Type of logged objects
      */
    `type`: Any): js.Array[Any] = js.native
    
    /**
      * Returns all public elements, i.e. elements that are part of public API aggregations
      *
      * @returns Array of matched elements
      */
    def getPublicElements(): js.Array[Any] = js.native
    
    /**
      * Gets the type of the execution scope
      *
      * @returns The type of the execution scope. Possible values are `global`, `subtree` or `components`.
      */
    def getType(): String = js.native
  }
}
