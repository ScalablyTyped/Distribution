package typings.ngTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Columns extends StObject {
    
    var columns: String = js.native
    
    var tableParams: String = js.native
  }
  object Columns {
    
    @scala.inline
    def apply(columns: String, tableParams: String): Columns = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], tableParams = tableParams.asInstanceOf[js.Any])
      __obj.asInstanceOf[Columns]
    }
    
    @scala.inline
    implicit class ColumnsMutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableParams(value: String): Self = StObject.set(x, "tableParams", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Controller extends StObject {
    
    var controller: String = js.native
    
    var controllerAs: String = js.native
    
    var replace: Boolean = js.native
    
    var restrict: String = js.native
    
    var scope: Boolean = js.native
    
    var templateUrl: js.Any = js.native
  }
  object Controller {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ControllerMutableBuilder[Self <: Controller] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrict(value: String): Self = StObject.set(x, "restrict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUrl(value: js.Any): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Disabled extends StObject {
    
    var disabled: Boolean = js.native
  }
  object Disabled {
    
    @scala.inline
    def apply(disabled: Boolean): Disabled = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Disabled]
    }
    
    @scala.inline
    implicit class DisabledMutableBuilder[Self <: Disabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Header extends StObject {
    
    var header: String = js.native
    
    var pagination: String = js.native
  }
  object Header {
    
    @scala.inline
    def apply(header: String, pagination: String): Header = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    @scala.inline
    implicit class HeaderMutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagination(value: String): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Show extends StObject {
    
    var show: Boolean = js.native
  }
  object Show {
    
    @scala.inline
    def apply(show: Boolean): Show = {
      val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[Show]
    }
    
    @scala.inline
    implicit class ShowMutableBuilder[Self <: Show] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    }
  }
}
