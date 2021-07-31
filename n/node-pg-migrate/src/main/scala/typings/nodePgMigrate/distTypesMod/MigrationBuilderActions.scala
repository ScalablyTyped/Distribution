package typings.nodePgMigrate.distTypesMod

import typings.nodePgMigrate.nodePgMigrateBooleans.`false`
import typings.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationBuilderActions extends StObject {
  
  var down: js.UndefOr[MigrationAction | `false`] = js.undefined
  
  var shorthands: js.UndefOr[ColumnDefinitions] = js.undefined
  
  var up: js.UndefOr[MigrationAction | `false`] = js.undefined
}
object MigrationBuilderActions {
  
  @scala.inline
  def apply(): MigrationBuilderActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationBuilderActions]
  }
  
  @scala.inline
  implicit class MigrationBuilderActionsMutableBuilder[Self <: MigrationBuilderActions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDown(value: MigrationAction | `false`): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownFunction2(
      value: (/* pgm */ MigrationBuilder, /* run */ js.UndefOr[js.Function0[Unit]]) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "down", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    @scala.inline
    def setShorthands(value: ColumnDefinitions): Self = StObject.set(x, "shorthands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShorthandsUndefined: Self = StObject.set(x, "shorthands", js.undefined)
    
    @scala.inline
    def setUp(value: MigrationAction | `false`): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpFunction2(
      value: (/* pgm */ MigrationBuilder, /* run */ js.UndefOr[js.Function0[Unit]]) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "up", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
