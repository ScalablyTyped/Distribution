package typings.ngTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Columns extends StObject {
    
    var columns: String
    
    var tableParams: String
  }
  object Columns {
    
    inline def apply(columns: String, tableParams: String): Columns = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], tableParams = tableParams.asInstanceOf[js.Any])
      __obj.asInstanceOf[Columns]
    }
    
    extension [Self <: Columns](x: Self) {
      
      inline def setColumns(value: String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setTableParams(value: String): Self = StObject.set(x, "tableParams", value.asInstanceOf[js.Any])
    }
  }
  
  trait Controller extends StObject {
    
    var controller: String
    
    var controllerAs: String
    
    var replace: Boolean
    
    var restrict: String
    
    var scope: Boolean
    
    var templateUrl: js.Any
  }
  object Controller {
    
    inline def apply(
      controller: String,
      controllerAs: String,
      replace: Boolean,
      restrict: String,
      scope: Boolean,
      templateUrl: js.Any
    ): Controller = {
      val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], controllerAs = controllerAs.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any], restrict = restrict.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], templateUrl = templateUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Controller]
    }
    
    extension [Self <: Controller](x: Self) {
      
      inline def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setRestrict(value: String): Self = StObject.set(x, "restrict", value.asInstanceOf[js.Any])
      
      inline def setScope(value: Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setTemplateUrl(value: js.Any): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait Disabled extends StObject {
    
    var disabled: Boolean
  }
  object Disabled {
    
    inline def apply(disabled: Boolean): Disabled = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Disabled]
    }
    
    extension [Self <: Disabled](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait Header extends StObject {
    
    var header: String
    
    var pagination: String
  }
  object Header {
    
    inline def apply(header: String, pagination: String): Header = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    extension [Self <: Header](x: Self) {
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setPagination(value: String): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    }
  }
  
  trait Show extends StObject {
    
    var show: Boolean
  }
  object Show {
    
    inline def apply(show: Boolean): Show = {
      val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[Show]
    }
    
    extension [Self <: Show](x: Self) {
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    }
  }
}
