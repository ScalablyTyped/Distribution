package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcEnumsBaseTypeMod {
  
  /**
    * @since 1.115
    *
    * Enumeration of the possible basic data types
    *
    * In {@link sap.ui.mdc.Field Field}, {@link sap.ui.mdc.MultiValueField MultiValueField}, and {@link sap.ui.mdc.FilterField FilterField},
    * different data types can be used. These data types might be model-dependent. To handle them model-independently,
    * basic types are used internally.
    */
  @JSImport("sap/ui/mdc/enums/BaseType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[BaseType & java.lang.String] = js.native
    
    /* "Boolean" */ val Boolean: typings.openui5.sapUiMdcEnumsBaseTypeMod.BaseType.Boolean & java.lang.String = js.native
    
    /* "Date" */ val Date: typings.openui5.sapUiMdcEnumsBaseTypeMod.BaseType.Date & java.lang.String = js.native
    
    /* "DateTime" */ val DateTime: typings.openui5.sapUiMdcEnumsBaseTypeMod.BaseType.DateTime & java.lang.String = js.native
    
    /* "Numeric" */ val Numeric: typings.openui5.sapUiMdcEnumsBaseTypeMod.BaseType.Numeric & java.lang.String = js.native
    
    /* "String" */ val String: typings.openui5.sapUiMdcEnumsBaseTypeMod.BaseType.String & java.lang.String = js.native
    
    /* "Time" */ val Time: typings.openui5.sapUiMdcEnumsBaseTypeMod.BaseType.Time & java.lang.String = js.native
    
    /* "Unit" */ val Unit: typings.openui5.sapUiMdcEnumsBaseTypeMod.BaseType.Unit & java.lang.String = js.native
  }
  
  @js.native
  sealed trait BaseType extends StObject
  /**
    * @since 1.115
    *
    * Enumeration of the possible basic data types
    *
    * In {@link sap.ui.mdc.Field Field}, {@link sap.ui.mdc.MultiValueField MultiValueField}, and {@link sap.ui.mdc.FilterField FilterField},
    * different data types can be used. These data types might be model-dependent. To handle them model-independently,
    * basic types are used internally.
    */
  @JSImport("sap/ui/mdc/enums/BaseType", "BaseType")
  @js.native
  object BaseType extends StObject {
    
    /**
      * Data type represents a Boolean
      */
    @js.native
    sealed trait Boolean
      extends StObject
         with BaseType
    
    /**
      * Data type represents a date
      */
    @js.native
    sealed trait Date
      extends StObject
         with BaseType
    
    /**
      * Data type represents a date with time
      */
    @js.native
    sealed trait DateTime
      extends StObject
         with BaseType
    
    /**
      * Data type represents a number. (This can be integer, float or any other numeric type.)
      */
    @js.native
    sealed trait Numeric
      extends StObject
         with BaseType
    
    /**
      * Data type represents a string
      */
    @js.native
    sealed trait String
      extends StObject
         with BaseType
    
    /**
      * Data type represents a time
      */
    @js.native
    sealed trait Time
      extends StObject
         with BaseType
    
    /**
      * Data type represents a unit. A composite type with a number and a unit part is used.
      */
    @js.native
    sealed trait Unit
      extends StObject
         with BaseType
  }
}
