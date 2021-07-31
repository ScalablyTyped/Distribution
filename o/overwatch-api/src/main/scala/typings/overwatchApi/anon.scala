package typings.overwatchApi

import typings.overwatchApi.mod.Endorsement
import typings.overwatchApi.mod.HeroAccuracy
import typings.overwatchApi.mod.HeroElimsPerLife
import typings.overwatchApi.mod.HeroMultiKillBest
import typings.overwatchApi.mod.HeroObjectiveKillsAverage
import typings.overwatchApi.mod.HeroPlaytime
import typings.overwatchApi.mod.HeroWinRate
import typings.overwatchApi.mod.HeroWins
import typings.overwatchApi.mod.QuickplayCompetitiveStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Assists extends StObject {
    
    var assists: QuickplayCompetitiveStats
    
    var average: QuickplayCompetitiveStats
    
    var best: QuickplayCompetitiveStats
    
    var combat: QuickplayCompetitiveStats
    
    var game: QuickplayCompetitiveStats
    
    var match_awards: QuickplayCompetitiveStats
    
    var miscellaneous: QuickplayCompetitiveStats
    
    var top_heroes: CompetitiveQuickplay
  }
  object Assists {
    
    @scala.inline
    def apply(
      assists: QuickplayCompetitiveStats,
      average: QuickplayCompetitiveStats,
      best: QuickplayCompetitiveStats,
      combat: QuickplayCompetitiveStats,
      game: QuickplayCompetitiveStats,
      match_awards: QuickplayCompetitiveStats,
      miscellaneous: QuickplayCompetitiveStats,
      top_heroes: CompetitiveQuickplay
    ): Assists = {
      val __obj = js.Dynamic.literal(assists = assists.asInstanceOf[js.Any], average = average.asInstanceOf[js.Any], best = best.asInstanceOf[js.Any], combat = combat.asInstanceOf[js.Any], game = game.asInstanceOf[js.Any], match_awards = match_awards.asInstanceOf[js.Any], miscellaneous = miscellaneous.asInstanceOf[js.Any], top_heroes = top_heroes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assists]
    }
    
    @scala.inline
    implicit class AssistsMutableBuilder[Self <: Assists] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssists(value: QuickplayCompetitiveStats): Self = StObject.set(x, "assists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAverage(value: QuickplayCompetitiveStats): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBest(value: QuickplayCompetitiveStats): Self = StObject.set(x, "best", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCombat(value: QuickplayCompetitiveStats): Self = StObject.set(x, "combat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGame(value: QuickplayCompetitiveStats): Self = StObject.set(x, "game", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatch_awards(value: QuickplayCompetitiveStats): Self = StObject.set(x, "match_awards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiscellaneous(value: QuickplayCompetitiveStats): Self = StObject.set(x, "miscellaneous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop_heroes(value: CompetitiveQuickplay): Self = StObject.set(x, "top_heroes", value.asInstanceOf[js.Any])
    }
  }
  
  trait Competitive extends StObject {
    
    var competitive: Draw
    
    var quickplay: Played
  }
  object Competitive {
    
    @scala.inline
    def apply(competitive: Draw, quickplay: Played): Competitive = {
      val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Competitive]
    }
    
    @scala.inline
    implicit class CompetitiveMutableBuilder[Self <: Competitive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompetitive(value: Draw): Self = StObject.set(x, "competitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuickplay(value: Played): Self = StObject.set(x, "quickplay", value.asInstanceOf[js.Any])
    }
  }
  
  trait CompetitiveQuickplay extends StObject {
    
    var competitive: Gameswon
    
    var quickplay: Eliminationsperlife
  }
  object CompetitiveQuickplay {
    
    @scala.inline
    def apply(competitive: Gameswon, quickplay: Eliminationsperlife): CompetitiveQuickplay = {
      val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompetitiveQuickplay]
    }
    
    @scala.inline
    implicit class CompetitiveQuickplayMutableBuilder[Self <: CompetitiveQuickplay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompetitive(value: Gameswon): Self = StObject.set(x, "competitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuickplay(value: Eliminationsperlife): Self = StObject.set(x, "quickplay", value.asInstanceOf[js.Any])
    }
  }
  
  trait Damage extends StObject {
    
    var damage: Rank
    
    var support: Rank
    
    var tank: Rank
  }
  object Damage {
    
    @scala.inline
    def apply(damage: Rank, support: Rank, tank: Rank): Damage = {
      val __obj = js.Dynamic.literal(damage = damage.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any], tank = tank.asInstanceOf[js.Any])
      __obj.asInstanceOf[Damage]
    }
    
    @scala.inline
    implicit class DamageMutableBuilder[Self <: Damage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDamage(value: Rank): Self = StObject.set(x, "damage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupport(value: Rank): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTank(value: Rank): Self = StObject.set(x, "tank", value.asInstanceOf[js.Any])
    }
  }
  
  trait Draw extends StObject {
    
    var draw: Double
    
    var lost: Double
    
    var played: Double
    
    var win_rate: Double
    
    var won: Double
  }
  object Draw {
    
    @scala.inline
    def apply(draw: Double, lost: Double, played: Double, win_rate: Double, won: Double): Draw = {
      val __obj = js.Dynamic.literal(draw = draw.asInstanceOf[js.Any], lost = lost.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], win_rate = win_rate.asInstanceOf[js.Any], won = won.asInstanceOf[js.Any])
      __obj.asInstanceOf[Draw]
    }
    
    @scala.inline
    implicit class DrawMutableBuilder[Self <: Draw] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDraw(value: Double): Self = StObject.set(x, "draw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLost(value: Double): Self = StObject.set(x, "lost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayed(value: Double): Self = StObject.set(x, "played", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWin_rate(value: Double): Self = StObject.set(x, "win_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWon(value: Double): Self = StObject.set(x, "won", value.asInstanceOf[js.Any])
    }
  }
  
  trait Eliminationsperlife extends StObject {
    
    var eliminations_per_life: js.Array[HeroElimsPerLife]
    
    var games_won: js.Array[HeroWins]
    
    var multikill_best: js.Array[HeroMultiKillBest]
    
    var objective_kills_average: js.Array[HeroObjectiveKillsAverage]
    
    var played: js.Array[HeroPlaytime]
    
    var weapon_accuracy: js.Array[HeroAccuracy]
  }
  object Eliminationsperlife {
    
    @scala.inline
    def apply(
      eliminations_per_life: js.Array[HeroElimsPerLife],
      games_won: js.Array[HeroWins],
      multikill_best: js.Array[HeroMultiKillBest],
      objective_kills_average: js.Array[HeroObjectiveKillsAverage],
      played: js.Array[HeroPlaytime],
      weapon_accuracy: js.Array[HeroAccuracy]
    ): Eliminationsperlife = {
      val __obj = js.Dynamic.literal(eliminations_per_life = eliminations_per_life.asInstanceOf[js.Any], games_won = games_won.asInstanceOf[js.Any], multikill_best = multikill_best.asInstanceOf[js.Any], objective_kills_average = objective_kills_average.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], weapon_accuracy = weapon_accuracy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Eliminationsperlife]
    }
    
    @scala.inline
    implicit class EliminationsperlifeMutableBuilder[Self <: Eliminationsperlife] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEliminations_per_life(value: js.Array[HeroElimsPerLife]): Self = StObject.set(x, "eliminations_per_life", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEliminations_per_lifeVarargs(value: HeroElimsPerLife*): Self = StObject.set(x, "eliminations_per_life", js.Array(value :_*))
      
      @scala.inline
      def setGames_won(value: js.Array[HeroWins]): Self = StObject.set(x, "games_won", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGames_wonVarargs(value: HeroWins*): Self = StObject.set(x, "games_won", js.Array(value :_*))
      
      @scala.inline
      def setMultikill_best(value: js.Array[HeroMultiKillBest]): Self = StObject.set(x, "multikill_best", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultikill_bestVarargs(value: HeroMultiKillBest*): Self = StObject.set(x, "multikill_best", js.Array(value :_*))
      
      @scala.inline
      def setObjective_kills_average(value: js.Array[HeroObjectiveKillsAverage]): Self = StObject.set(x, "objective_kills_average", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjective_kills_averageVarargs(value: HeroObjectiveKillsAverage*): Self = StObject.set(x, "objective_kills_average", js.Array(value :_*))
      
      @scala.inline
      def setPlayed(value: js.Array[HeroPlaytime]): Self = StObject.set(x, "played", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayedVarargs(value: HeroPlaytime*): Self = StObject.set(x, "played", js.Array(value :_*))
      
      @scala.inline
      def setWeapon_accuracy(value: js.Array[HeroAccuracy]): Self = StObject.set(x, "weapon_accuracy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeapon_accuracyVarargs(value: HeroAccuracy*): Self = StObject.set(x, "weapon_accuracy", js.Array(value :_*))
    }
  }
  
  trait Frame extends StObject {
    
    var frame: String
    
    var icon: String
    
    var level: Double
    
    var shotcaller: Endorsement
    
    var sportsmanship: Endorsement
    
    var teammate: Endorsement
  }
  object Frame {
    
    @scala.inline
    def apply(
      frame: String,
      icon: String,
      level: Double,
      shotcaller: Endorsement,
      sportsmanship: Endorsement,
      teammate: Endorsement
    ): Frame = {
      val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], shotcaller = shotcaller.asInstanceOf[js.Any], sportsmanship = sportsmanship.asInstanceOf[js.Any], teammate = teammate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Frame]
    }
    
    @scala.inline
    implicit class FrameMutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrame(value: String): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShotcaller(value: Endorsement): Self = StObject.set(x, "shotcaller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSportsmanship(value: Endorsement): Self = StObject.set(x, "sportsmanship", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeammate(value: Endorsement): Self = StObject.set(x, "teammate", value.asInstanceOf[js.Any])
    }
  }
  
  trait Gameswon extends StObject {
    
    var eliminations_per_life: js.Array[HeroElimsPerLife]
    
    var games_won: js.Array[HeroWins]
    
    var multikill_best: js.Array[HeroMultiKillBest]
    
    var objective_kills_average: js.Array[HeroObjectiveKillsAverage]
    
    var played: js.Array[HeroPlaytime]
    
    var weapon_accuracy: js.Array[HeroAccuracy]
    
    var win_rate: js.Array[HeroWinRate]
  }
  object Gameswon {
    
    @scala.inline
    def apply(
      eliminations_per_life: js.Array[HeroElimsPerLife],
      games_won: js.Array[HeroWins],
      multikill_best: js.Array[HeroMultiKillBest],
      objective_kills_average: js.Array[HeroObjectiveKillsAverage],
      played: js.Array[HeroPlaytime],
      weapon_accuracy: js.Array[HeroAccuracy],
      win_rate: js.Array[HeroWinRate]
    ): Gameswon = {
      val __obj = js.Dynamic.literal(eliminations_per_life = eliminations_per_life.asInstanceOf[js.Any], games_won = games_won.asInstanceOf[js.Any], multikill_best = multikill_best.asInstanceOf[js.Any], objective_kills_average = objective_kills_average.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], weapon_accuracy = weapon_accuracy.asInstanceOf[js.Any], win_rate = win_rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Gameswon]
    }
    
    @scala.inline
    implicit class GameswonMutableBuilder[Self <: Gameswon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEliminations_per_life(value: js.Array[HeroElimsPerLife]): Self = StObject.set(x, "eliminations_per_life", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEliminations_per_lifeVarargs(value: HeroElimsPerLife*): Self = StObject.set(x, "eliminations_per_life", js.Array(value :_*))
      
      @scala.inline
      def setGames_won(value: js.Array[HeroWins]): Self = StObject.set(x, "games_won", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGames_wonVarargs(value: HeroWins*): Self = StObject.set(x, "games_won", js.Array(value :_*))
      
      @scala.inline
      def setMultikill_best(value: js.Array[HeroMultiKillBest]): Self = StObject.set(x, "multikill_best", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultikill_bestVarargs(value: HeroMultiKillBest*): Self = StObject.set(x, "multikill_best", js.Array(value :_*))
      
      @scala.inline
      def setObjective_kills_average(value: js.Array[HeroObjectiveKillsAverage]): Self = StObject.set(x, "objective_kills_average", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjective_kills_averageVarargs(value: HeroObjectiveKillsAverage*): Self = StObject.set(x, "objective_kills_average", js.Array(value :_*))
      
      @scala.inline
      def setPlayed(value: js.Array[HeroPlaytime]): Self = StObject.set(x, "played", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayedVarargs(value: HeroPlaytime*): Self = StObject.set(x, "played", js.Array(value :_*))
      
      @scala.inline
      def setWeapon_accuracy(value: js.Array[HeroAccuracy]): Self = StObject.set(x, "weapon_accuracy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeapon_accuracyVarargs(value: HeroAccuracy*): Self = StObject.set(x, "weapon_accuracy", js.Array(value :_*))
      
      @scala.inline
      def setWin_rate(value: js.Array[HeroWinRate]): Self = StObject.set(x, "win_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWin_rateVarargs(value: HeroWinRate*): Self = StObject.set(x, "win_rate", js.Array(value :_*))
    }
  }
  
  trait Played extends StObject {
    
    var played: Unit
    
    var won: Double
  }
  object Played {
    
    @scala.inline
    def apply(played: Unit, won: Double): Played = {
      val __obj = js.Dynamic.literal(played = played.asInstanceOf[js.Any], won = won.asInstanceOf[js.Any])
      __obj.asInstanceOf[Played]
    }
    
    @scala.inline
    implicit class PlayedMutableBuilder[Self <: Played] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlayed(value: Unit): Self = StObject.set(x, "played", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWon(value: Double): Self = StObject.set(x, "won", value.asInstanceOf[js.Any])
    }
  }
  
  trait Quickplay extends StObject {
    
    var competitive: String
    
    var quickplay: String
  }
  object Quickplay {
    
    @scala.inline
    def apply(competitive: String, quickplay: String): Quickplay = {
      val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Quickplay]
    }
    
    @scala.inline
    implicit class QuickplayMutableBuilder[Self <: Quickplay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompetitive(value: String): Self = StObject.set(x, "competitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuickplay(value: String): Self = StObject.set(x, "quickplay", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rank extends StObject {
    
    var rank: Double
    
    var rank_img: String
  }
  object Rank {
    
    @scala.inline
    def apply(rank: Double, rank_img: String): Rank = {
      val __obj = js.Dynamic.literal(rank = rank.asInstanceOf[js.Any], rank_img = rank_img.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rank]
    }
    
    @scala.inline
    implicit class RankMutableBuilder[Self <: Rank] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRank_img(value: String): Self = StObject.set(x, "rank_img", value.asInstanceOf[js.Any])
    }
  }
}
