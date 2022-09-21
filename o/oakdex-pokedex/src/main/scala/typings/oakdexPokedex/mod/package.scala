package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StringDictionary
import typings.oakdexPokedex.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def allAbilities(): js.Array[Ability] = ^.asInstanceOf[js.Dynamic].applyDynamic("allAbilities")().asInstanceOf[js.Array[Ability]]
inline def allAbilities(conditions: Conditions): js.Array[Ability] = ^.asInstanceOf[js.Dynamic].applyDynamic("allAbilities")(conditions.asInstanceOf[js.Any]).asInstanceOf[js.Array[Ability]]

inline def allEggGroups(): js.Array[EggGroup] = ^.asInstanceOf[js.Dynamic].applyDynamic("allEggGroups")().asInstanceOf[js.Array[EggGroup]]
inline def allEggGroups(conditions: Conditions): js.Array[EggGroup] = ^.asInstanceOf[js.Dynamic].applyDynamic("allEggGroups")(conditions.asInstanceOf[js.Any]).asInstanceOf[js.Array[EggGroup]]

inline def allGenerations(): js.Array[Generation] = ^.asInstanceOf[js.Dynamic].applyDynamic("allGenerations")().asInstanceOf[js.Array[Generation]]
inline def allGenerations(conditions: Conditions): js.Array[Generation] = ^.asInstanceOf[js.Dynamic].applyDynamic("allGenerations")(conditions.asInstanceOf[js.Any]).asInstanceOf[js.Array[Generation]]

inline def allItems(): js.Array[Item] = ^.asInstanceOf[js.Dynamic].applyDynamic("allItems")().asInstanceOf[js.Array[Item]]
inline def allItems(conditions: Conditions): js.Array[Item] = ^.asInstanceOf[js.Dynamic].applyDynamic("allItems")(conditions.asInstanceOf[js.Any]).asInstanceOf[js.Array[Item]]

inline def allNatures(): js.Array[Nature] = ^.asInstanceOf[js.Dynamic].applyDynamic("allNatures")().asInstanceOf[js.Array[Nature]]
inline def allNatures(conditions: Conditions): js.Array[Nature] = ^.asInstanceOf[js.Dynamic].applyDynamic("allNatures")(conditions.asInstanceOf[js.Any]).asInstanceOf[js.Array[Nature]]

inline def allPokemon(): js.Array[Pokemon] = ^.asInstanceOf[js.Dynamic].applyDynamic("allPokemon")().asInstanceOf[js.Array[Pokemon]]
inline def allPokemon(conditions: Conditions): js.Array[Pokemon] = ^.asInstanceOf[js.Dynamic].applyDynamic("allPokemon")(conditions.asInstanceOf[js.Any]).asInstanceOf[js.Array[Pokemon]]

inline def allRegions(): js.Array[Region] = ^.asInstanceOf[js.Dynamic].applyDynamic("allRegions")().asInstanceOf[js.Array[Region]]
inline def allRegions(conditions: Conditions): js.Array[Region] = ^.asInstanceOf[js.Dynamic].applyDynamic("allRegions")(conditions.asInstanceOf[js.Any]).asInstanceOf[js.Array[Region]]

inline def allTypes(): js.Array[PokemonType] = ^.asInstanceOf[js.Dynamic].applyDynamic("allTypes")().asInstanceOf[js.Array[PokemonType]]
inline def allTypes(conditions: Conditions): js.Array[PokemonType] = ^.asInstanceOf[js.Dynamic].applyDynamic("allTypes")(conditions.asInstanceOf[js.Any]).asInstanceOf[js.Array[PokemonType]]

inline def findAbility(name: String): Ability | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findAbility")(name.asInstanceOf[js.Any]).asInstanceOf[Ability | Null]

inline def findEggGroup(name: String): EggGroup | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findEggGroup")(name.asInstanceOf[js.Any]).asInstanceOf[EggGroup | Null]

inline def findGeneration(name: String): Generation | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findGeneration")(name.asInstanceOf[js.Any]).asInstanceOf[Generation | Null]

inline def findItem(name: String): Item | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findItem")(name.asInstanceOf[js.Any]).asInstanceOf[Item | Null]

inline def findMove(name: String): Move | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findMove")(name.asInstanceOf[js.Any]).asInstanceOf[Move | Null]

inline def findNature(name: String): Nature | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findNature")(name.asInstanceOf[js.Any]).asInstanceOf[Nature | Null]

inline def findPokemon(idOrName: String): Pokemon | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findPokemon")(idOrName.asInstanceOf[js.Any]).asInstanceOf[Pokemon | Null]
inline def findPokemon(idOrName: Double): Pokemon | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findPokemon")(idOrName.asInstanceOf[js.Any]).asInstanceOf[Pokemon | Null]

inline def findRegion(name: String): Region | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findRegion")(name.asInstanceOf[js.Any]).asInstanceOf[Region | Null]

inline def findType(name: String): PokemonType | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findType")(name.asInstanceOf[js.Any]).asInstanceOf[PokemonType | Null]

inline def importPokemon(customPokemon: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("importPokemon")(customPokemon.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def importPokemon(customPokemon: js.Array[Pokemon | String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("importPokemon")(customPokemon.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def resetPokemon(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetPokemon")().asInstanceOf[Unit]

type Conditions = StringDictionary[Any]
