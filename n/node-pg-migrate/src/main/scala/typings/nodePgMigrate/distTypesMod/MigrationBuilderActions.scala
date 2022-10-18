package typings.nodePgMigrate.distTypesMod

import typings.nodePgMigrate.distOperationsTablesTypesMod.ColumnDefinitions
import typings.nodePgMigrate.nodePgMigrateBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationBuilderActions extends StObject {
  
  var down: js.UndefOr[MigrationAction | `false`] = js.undefined
  
  var shorthands: js.UndefOr[ColumnDefinitions] = js.undefined
  
  var up: js.UndefOr[MigrationAction | `false`] = js.undefined
}
object MigrationBuilderActions {
  
  inline def apply(): MigrationBuilderActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationBuilderActions]
  }
  
  extension [Self <: MigrationBuilderActions](x: Self) {
    
    inline def setDown(value: MigrationAction | `false`): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setDownFunction2(
      value: (/* pgm */ MigrationBuilder, /* run */ js.UndefOr[js.Function0[Unit]]) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "down", js.Any.fromFunction2(value))
    
    inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    inline def setShorthands(value: ColumnDefinitions): Self = StObject.set(x, "shorthands", value.asInstanceOf[js.Any])
    
    inline def setShorthandsUndefined: Self = StObject.set(x, "shorthands", js.undefined)
    
    inline def setUp(value: MigrationAction | `false`): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    inline def setUpFunction2(
      value: (/* pgm */ MigrationBuilder, /* run */ js.UndefOr[js.Function0[Unit]]) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "up", js.Any.fromFunction2(value))
    
    inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
